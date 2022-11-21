package botelinStrings;
import java.util.Scanner;

public class ejercicio8b {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String stgInput, stgIntOfInput, stgCharOfInput;
        int intOfInput = 0;
        char charOfInput = 0; //NULL
        
        do {
            System.out.print("Introduce una cadena de texto: ");
            stgInput = keyboard.nextLine();
        } while (stgInput.equals(""));
        
        StringBuilder outputStg = new StringBuilder(stgInput.length());
        outputStg.append(stgInput);
        
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
        
        outputStg.setCharAt(intOfInput, charOfInput);
        
        System.out.println(outputStg);
    }
    
}
