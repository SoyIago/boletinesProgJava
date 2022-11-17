package botelinStrings;
import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine(), output = "";
        
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 != 0) output += '*';
            else output += input.charAt(i);
        }
        
        System.out.println(output);
    }
    
}
