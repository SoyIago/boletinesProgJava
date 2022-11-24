package B4_ClasesObjetos;
import java.util.Scanner;
import B4_ClasesObjetos_Recursos.MovilPrepago;

public class ejercicio2 {

    private static String askQuestion (String question, String hangCondition) {
        Scanner keyboard = new Scanner(System.in);
        String keyboardInput;
        do {
            System.out.print(question);
            keyboardInput = keyboard.nextLine();
        } while (!keyboardInput.matches(hangCondition));
        return keyboardInput;
    }
    
    private static void cargarSaldo(MovilPrepago telefono) {
        int _input = Integer.parseInt(askQuestion("?Cuanto quieres recargar? ", "[0-9]*"));
        
        if (_input % 5 != 0) System.out.println("Solo se pueden recargar multiplos de 5¤.");
        if (telefono.recargar(_input)) System.out.format("Se han recargado %d¤.\n", _input);
        else System.out.println("No se ha podido realizar la recarga.");
    }
    
    private static void imprimirSaldo(MovilPrepago telefono) {
        System.out.format("Te quedan %fE", telefono.consultarSaldo());
    }
    
    private static void hacerLlamada(MovilPrepago telefono, Scanner keyboard) {
        // Esta complicado hacer una simulacion real de una llamada sin ahogar a la CPU
        float saldo = telefono.consultarSaldo();
        if (saldo < 0.25f) {
            System.out.println("No puedes llamar, no tienes suficiente saldo");
            return;
        }
        long initCallTimeStamp = System.currentTimeMillis();
        long maxCallTimeStamp = (long) ((saldo - 0.25f) / 0.05f) * 60000 + initCallTimeStamp;
        
        System.out.println("Pulsa cualquier tecla para colgar...");
        do {
            // En realidad, el programa se queda atascado hasta que se interrumpa la llamada
            if (keyboard.hasNextLine()) break;
        } while (maxCallTimeStamp >= System.currentTimeMillis());
        
        if (maxCallTimeStamp >= System.currentTimeMillis()) System.out.println("La llamada ha finalizado, no tienes suficiente saldo.");
        telefono.efectuarLlamada((int)((System.currentTimeMillis() - initCallTimeStamp) / 1000));
    }
    
    private static void navegar(MovilPrepago telefono) {
        if (telefono.consultarSaldo() < 0.5f) {
            System.out.println("Estas sin saldo, necesitas almenos 0.50E para navegar.");
            return;
        } 
        String web = askQuestion("Introduce una URL: ", "[A-Za-z.]{3,}");
        int _webSize = (int)(Math.random() * web.length() % 3) + 1;
        System.out.format("Descargando %s: %d MB totales", web, _webSize);
        telefono.navegar(_webSize);
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String keyboardInput;
        System.out.print("Elije tu nuevo número de telefono:\n\n");
        
        int randomNumbers[] = new int [10];
        do {
            for (int i = 0; i < 10; i++) {
                randomNumbers[i] = (int) (Math.random() * 100000000) + 600000000;
                System.out.format("%d. %d\n", (i + 1), randomNumbers[i]);
            }
            System.out.print("\nElige uno entre el uno y el diez, cualquier otro valor para generar otra lista: ");
            keyboardInput = keyboard.nextLine();
        } while (!keyboardInput.matches("([1-9]|10)"));
        
        MovilPrepago telefono = new MovilPrepago((long) randomNumbers[Integer.parseInt(keyboardInput) - 1], 0.20f, 0.05f, 0.025f, 0.50f);
        System.out.format("Bienvenido, %d.\n", telefono.numeroMovil);
        
        int _input;
        do {
            if (telefono.consultarSaldo() < 10) System.out.print("AVISO: Tienes un saldo inferior a 10E.\n");
            
            System.out.print("1) Recargar saldo.\n2) Consultar saldo\n3) Hacer llamada\n4) Visitar web.\n5) Salir.\n");
            _input = Integer.parseInt(askQuestion("Elige una opción: ", "\\d"));
            
            switch (_input) {
                case 1 -> cargarSaldo(telefono);
                case 2 -> imprimirSaldo(telefono);
                case 3 -> hacerLlamada(telefono, keyboard);
                case 4 -> navegar(telefono);
            }
            
        } while (_input < 5);
    }
    
}
