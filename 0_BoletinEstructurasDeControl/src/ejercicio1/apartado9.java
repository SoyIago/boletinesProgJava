package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado9 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("IX. Leer dos números enteros y diga si el segundo es divisor del primero.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = keyboard.nextInt();
        if (num2 != 0 && num1 % num2 == 0) System.out.print(num2 + " es divisor de " + num1 + ".\n");
        else System.out.print(num2 + " no es divisor de " + num1 + ".\n");
    }
    
}
