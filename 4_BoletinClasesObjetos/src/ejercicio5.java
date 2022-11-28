package B4_ClasesObjetos;
import java.util.Scanner;
import B4_ClasesObjetos_Recursos.Ahorcado;
/**
 *
 * @author iago.xoan.casalneira
 */
public class ejercicio5 {

    public static void main() {
        Ahorcado hangMan = new Ahorcado("x", "d");

        do {
            hangMan.probarLetra(getInput("Introduce una letra: "));
            hangMan.pintar();
        } while (!hangMan.perdio() && !hangMan.adivinada());
        
        if (hangMan.adivinada()) System.out.println("Has ganado.");
        else System.out.println("Has perdido.");
    }
    
    /**
    * Valida la entrada de datos por consola, pide que se introduzca una letra hasta que la entrada sea correcta.
    * @param message Mensaje que se sacara por pantalla para informar al usuario de que debe introducir datos.
    * @return Un tipo `char` compredido dentro del alfabeto español.
    **/
    private static char getInput(String message) {
        Scanner keyboard = new Scanner(System.in);
        String _kbdInput;
        
        do {
            System.out.print(message);
            _kbdInput  = keyboard.nextLine();
        } while (!_kbdInput.matches("[A-Za-zÑñ]"));
        
        return _kbdInput.charAt(0);
    }
    
}
