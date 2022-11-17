package botelinStrings;
import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String newChain = "";
        
        for (int i = 0; i < 10; i++) {
            String input;
            do {
                System.out.print("Cadena " + (i + 1) + ": ");
                input = keyboard.nextLine();
            } while (input.length() < 1);
            newChain += input.charAt(0);
        }
        
        System.out.println(newChain);
    }
    
}
