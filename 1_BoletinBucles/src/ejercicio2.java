import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Dame un numero: ");
        int inputN = keyboard.nextInt();
        
        for (int i = 0; i < inputN; i++) {
            System.out.println(i);
        }
    }
    
}
