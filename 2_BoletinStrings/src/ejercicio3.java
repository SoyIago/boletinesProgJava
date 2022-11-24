package B2_Strings;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Dame un linea: ");
        String line = keyboard.nextLine();
        
        System.out.print("Caracter a comprobar: ");
        String character = keyboard.nextLine().substring(0, 1);
        
        System.out.println("El caracter '" + character + "' se repite " + (line.split(character).length - 1) + " veces.");
    }
    
}
