import java.util.Scanner;

public class ejercicio3a {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberInput;
        
        do {
            System.out.print("Dame un numero: ");
            numberInput = keyboard.nextInt();
        } while (numberInput % 2 == 0);
    }

}
