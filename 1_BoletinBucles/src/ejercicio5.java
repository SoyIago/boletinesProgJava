package B1_Bucles;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int acumulador = 0;
        int numberInput;
        
        do {
            System.out.print("Dame un numero: ");
            numberInput = keyboard.nextInt();
            if (numberInput > 0) {
                acumulador += numberInput;
                System.out.println("Acumulador: " + acumulador);
            }
        } while (numberInput != -1);
    }
    
}
