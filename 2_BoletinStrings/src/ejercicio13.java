package B2_Strings;
import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        
        do {
            System.out.print("Introduce un numero decimal: ");
            input = keyboard.nextLine();
        } while (!(input.matches("\\d{1,}")));
        
        // Segun la formula de conversion de decimal a hexadecimal que se
        // usa sobre el papel:
        //
        // Tomamos el resto de la division entre 16 como valor del numero
        // hexadecimal, continuamos dividiendo de esta forma el cociente
        // hasta que ya no sea posible, los restos se concatenan del mas
        // reciente al mas antiguo.
        //
        // Los numeros se convierten al momento a su respectivo caracter
        // del sistema hexadecimal.
        
        int _parsedInt = Integer.parseInt(input), lastNumber = _parsedInt;
        String hexFormatNumber = "";
        
        while (lastNumber >= 0) {
            byte _value = (byte) (lastNumber % 16);
            if (lastNumber >= 16) lastNumber /= 16;
            else lastNumber = -1;
            // Los numeros ASCII comienzan en el caracter 48, las letras
            // mayusculas comienzan en el 65 y _value siempre es >=10.
            if (_value <= 9) hexFormatNumber = (char) (_value + 48) + hexFormatNumber;
            else hexFormatNumber = (char) (_value + 55) + hexFormatNumber;
        }
        
        System.out.println("\nResultados:");
        System.out.println("- Este programa: " + hexFormatNumber);
        System.out.println("- Java built-in: " + Integer.toHexString(_parsedInt));

    }
    
}
