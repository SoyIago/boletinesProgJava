package botelinStrings;
import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Dame una cadena: ");
        String input = keyboard.nextLine();
        
        StringBuilder inputSB = new StringBuilder(input.length());
        inputSB.append(input);
        
        inputSB.deleteCharAt(3);
        inputSB.insert(5, 'x');
        inputSB.setCharAt(1, 'z');
        inputSB.delete(5, 10);
        inputSB.reverse();
        
        input = inputSB.toString();
        System.out.println(input);
    }
    
}
