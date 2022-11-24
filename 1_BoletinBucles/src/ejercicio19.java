package B1_Bucles;
import java.util.Scanner;

public class ejercicio19 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input, last;
        
        System.out.print("Primer numero: ");
        last = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        input = keyboard.nextInt();
        
        while (input != 0 && input > last)  {
            last = input;
            System.out.println("Estan ordenados ascendentemente.");
            System.out.print("Otro numero: ");
            input = keyboard.nextInt();
        }

    }
    
}
