package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("VIII. Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos números son iguales.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = keyboard.nextInt();
        if (num1 > num2) System.out.print(num1 + " es mayor que " + num2 + ".\n");
        else if (num1 < num2) System.out.print(num1 + " es menor que " + num2 + ".\n");
        else System.out.print("Ambos numeros son iguales.\n");
    }
    
}
