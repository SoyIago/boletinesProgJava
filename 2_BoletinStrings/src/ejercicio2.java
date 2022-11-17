package botelinStrings;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String checksumList = "TRWAGMYFPDXBNJZSQVHLCKE";
        int input;
        
        do {
            System.out.println("Dame un numero: ");
            input = Integer.parseInt(keyboard.nextLine());
        } while (input > 99999999);
        
        System.out.println("El DNI completo es " + input + checksumList.charAt(input % 23));
    }
    
}
