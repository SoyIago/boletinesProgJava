package B2_Strings;
import java.util.Scanner;

public class ejercicio9a {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int ageParsed;
        do {
            System.out.print("Dame tu nombre: ");
            name = keyboard.nextLine();
        } while (name.equals(""));
        
        do {
            System.out.print("Dame tu edad: ");
            ageParsed = Integer.parseInt(keyboard.nextLine());
        } while (ageParsed < 1);
        
        System.out.println("Hola, me llamo " + name + " y tengo " + ageParsed + " años");
    }
    
}
