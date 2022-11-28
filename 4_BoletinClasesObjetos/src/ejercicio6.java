package B4_ClasesObjetos;
import java.util.Scanner;
import B4_ClasesObjetos_Recursos.Nim;
import B4_ClasesObjetos_Recursos.Consola;

/**
 *
 * @author iago.xoan.casalneira
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Nim tableroNim = new Nim();
        byte jugadas = 1;
        
        if (Math.random() > 0.5d) jugadas--;
        
        if (jugadas == 0) System.out.println("Comienzas tú.");
        else System.out.println("Comienza la CPU.");
        Consola.pintarTablero(tableroNim);
        
        while (!tableroNim.fin()) {
            if (jugadas % 2 == 0) {
                if (jugadas > 0) System.out.println("Tú turno.");
                int[] human = askHuman();
                tableroNim.juega(human[0], human[1]);
                System.out.format("Tomas %d palito(s) en la fila %d:\n", human[1], human[0]);
                Consola.pintarTablero(tableroNim);
            }
            else {
                if (jugadas > 1) System.out.println("Turno de CPU.");
                int[] cpu = parseResult(tableroNim.piensa());
                tableroNim.juega(cpu[0], cpu[1]);
                System.out.format("CPU toma %d palito(s) en la fila %d:\n", cpu[1], cpu[0]);
                Consola.pintarTablero(tableroNim);
            }
            jugadas++;
        }
        
        if (jugadas % 2 != 0) System.out.println("Has ganado.");
        else System.out.println("Gano la CPU.");
        
    }
    
    /**
     * Valora la entrada de datos suministrada conforme a las necesidades de Nim.
     * @param result La jugada a hacer en el juego Nim.
     * @return Devuelve un `array` con los valores de la colummna y el numero de palitos.
    **/
    private static int[] parseResult(int result) {
        int[] parsedResult = {0, 0};
        
        if (result <= 3) parsedResult[1] = result;
        else if (result <= 15) {
            parsedResult[1] = result - 10; 
            parsedResult[0] = 1;
        } else if (result <= 27){
            parsedResult[1] = result - 20;
            parsedResult[0] = 2;
        }
        
        return parsedResult;
    }
    /**
     * Solicita y valida la entrada de teclado necesaria para el juego Nim.
     * @return Devuelve un `array` con los valores de la colummna y el numero de palitos.
    **/
    private static int[] askHuman() {
        Scanner keyboard = new Scanner(System.in);
        int[] parsedResult = {0, 0};
        
        for (int i = 0; i < 2; i++) {
            String _kbdInput;
            do {
                if (i == 0) System.out.print("Fila: ");
                else if (i == 1) System.out.print("Palitos: ");
                _kbdInput = keyboard.nextLine();
            } while (!_kbdInput.matches("\\d"));
            var _parsed = Integer.parseInt(_kbdInput);
            
            if (i == 0) {
                if (_parsed >= 1 && _parsed <= 3) parsedResult[0] = _parsed - 1; 
            } if (i == 1) {
                if (parsedResult[0] == 0 && _parsed > 3) i--;
                else if (parsedResult[0] == 1 && _parsed > 5) i--;
                else if (parsedResult[0] == 2 && _parsed > 7) i--;
                else parsedResult[1] = _parsed;
            }
        }
        return parsedResult;
        
    }
}
