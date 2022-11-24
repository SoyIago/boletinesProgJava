package B4_ClasesObjetos;
import java.util.Scanner;
import B4_ClasesObjetos_Recursos.CuentaCorriente;

public class ejercicio3 {

    private static String askQuestion (String question, String hangCondition) {
        Scanner keyboard = new Scanner(System.in);
        String keyboardInput;
        do {
            System.out.print(question);
            keyboardInput = keyboard.nextLine();
        } while (!keyboardInput.matches(hangCondition));
        return keyboardInput;
    }
    
    private static void ingreso(CuentaCorriente IBAN) {
        IBAN.ingresar(Integer.parseInt(askQuestion("Cuanto vas a ingresar? ", "[0-9]{1,}")));
    }
    
    private static void retirar(CuentaCorriente IBAN) {
        float retirada = Float.parseFloat(askQuestion("Cuanto vas a retirar? ", "[0-9]{1,}"));
        if (IBAN.retirar(retirada)) System.out.format("Retirados %fE.\n", retirada);
        else System.out.format("Retiro de %fE denegado.\n", retirada);
    }
    
    private static void verSaldo(CuentaCorriente IBAN) {
        System.out.format("Actualmente tienes %fE.\n", IBAN.getSaldo());
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Numero de cuenta completamente arbitrario.
        CuentaCorriente IBAN1 = new CuentaCorriente("ES" + (long) ((Math.random() * 
                999999999999999999999999d) + 
                100000000000000000000000d));
        
        System.out.format("Hola %s\n", IBAN1.IBAN);
        
        String keyboardInput;
        int parsedInput = 0;
        do {
            System.out.print("\n1. Ingresar.\n2. Retirar.\n3. Ver saldo.\n");
            keyboardInput = keyboard.nextLine();
            
            if (keyboardInput.matches("\\d")) parsedInput = Integer.parseInt(keyboardInput);
            
            switch (parsedInput) {
                case 1 -> ingreso(IBAN1);
                case 2 -> retirar(IBAN1);
                case 3 -> verSaldo(IBAN1);
            }
        } while (parsedInput < 4);
    }
    
}
