package B1_Bucles;
import java.util.Scanner;

public class ejercicio23 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int suma = 0, i;

        for (i = 1; i < 16; i++) {
            System.out.print("Dame un número: ");
            int _input = keyboard.nextInt();
            if (_input > 1000) break;
            else suma += _input;
        }
        
        System.out.println("Se sumaron " + i + " números, con un valor total de " + suma + ".");
    }
    
}
