package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado11 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("XI. Leer un número y decir si es múltiplo de 2, de 3 y/o de 10\n");
        System.out.print("Numero: ");
        int num1 = keyboard.nextInt();
        if (num1 % 2 == 0) {
            System.out.print(num1 + " es multiplo de 2.\n");
            if (num1 % 10 == 0) System.out.print(num1 + " es multiplo de 10.\n");
        }
        if (num1 % 3 == 0) System.out.print(num1 + " es multiplo de 3.\n");
    }
    
}
