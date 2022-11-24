package B1_Bucles;
import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Dame un número positivo: ");
            numero = keyboard.nextInt();
        } while (numero < 0);
    }
    
}
