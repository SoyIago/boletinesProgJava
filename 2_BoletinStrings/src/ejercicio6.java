package botelinStrings;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String inputEmail;
        do {
            System.out.print("Dame un email: ");
            inputEmail = keyboard.nextLine();
        } while (inputEmail.split("@").length != 2);
        
        System.out.println(inputEmail.split("@", 2)[1]);
    }
    
}
