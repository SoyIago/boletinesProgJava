package B2_Strings;
import java.util.Scanner;

public class ejercicio8a {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String stgInput, stgIntOfInput, stgCharOfInput;
        int intOfInput = 0;
        char charOfInput = 0; //NULL
        
        do {
            System.out.print("Introduce una cadena de texto: ");
            stgInput = keyboard.nextLine();
        } while ("".equals(stgInput));
        
        do {
            System.out.print("Introduce la posicion de un caracter: ");
            stgIntOfInput = keyboard.nextLine();
            if (stgIntOfInput.matches("\\d{1,}")) intOfInput = Integer.parseInt(stgIntOfInput) - 1;
        } while (intOfInput > 0 && intOfInput >= stgInput.length());
        
        do {
            System.out.print("Introduce un caracter: ");
            stgCharOfInput = keyboard.nextLine();
            if (stgCharOfInput.length() == 1) charOfInput = stgCharOfInput.charAt(0);
        } while (charOfInput == 0);
        
        String[] _replacement = {stgInput.substring(0, intOfInput - 1), 
                                 stgInput.substring(intOfInput)};
        
        String replacedStg = _replacement[0] + charOfInput + _replacement[1];
        
        System.out.println(replacedStg);
    }
    
}
