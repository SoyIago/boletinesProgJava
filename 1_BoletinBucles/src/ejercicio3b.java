package B1_Bucles;
import java.util.Scanner;

public class ejercicio3b {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int numberInput = keyboard.nextInt();
        
        while (numberInput % 2 == 0) {
            System.out.print("Dame un numero: ");
            numberInput = keyboard.nextInt();
        }
    }
    
}
