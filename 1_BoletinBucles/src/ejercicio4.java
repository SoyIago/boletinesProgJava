package B1_Bucles;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dame un numero entre 1 y 10: ");
        int inputNumber = keyboard.nextInt();
        
        if ((1 <= inputNumber) && (inputNumber <= 10)) {
            for (int i = 1; i <=10; i++) {
                System.out.println(inputNumber + " x " + i + " = " + (inputNumber * i));
            }
        }
    }
    
}
