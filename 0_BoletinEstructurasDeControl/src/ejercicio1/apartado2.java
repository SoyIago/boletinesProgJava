package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("II. Leer dos números enteros y muestre si el primero es mayor que el segundo.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = keyboard.nextInt();
        if (num1 > num2) System.out.print(num1 + " es mayor que " + num2 + ".\n");
    }
    
}
