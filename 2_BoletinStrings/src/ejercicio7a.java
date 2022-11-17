package botelinStrings;
import java.util.Scanner;

public class ejercicio7a {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String charset = "abcdefghijklmnopkqrstuwxyz";
        int _shift = 4;
        
        System.out.println("Texto a encriptar:");
        String input = keyboard.nextLine();
        String output = "";
        
        for (int i = 0 ; i < input.length(); i++) {
            //Ignorar el caracter si no esta en la lista.
            if (charset.contains(input.charAt(i) + "")) {
                int index = charset.indexOf(input.charAt(i)) + _shift;
                if (index > charset.length()) index -= charset.length();
                output += charset.charAt(index);
            }
            else output += input.charAt(i);
        }
        
        System.out.println("Texto encriptado:");
        System.out.println(output);
    }
    
}
