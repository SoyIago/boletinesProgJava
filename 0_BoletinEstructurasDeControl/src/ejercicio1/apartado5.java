package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado5 {

    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        System.out.print("\nV. Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = keyboard.nextInt();
        if (num1 > 10 || num2 > 10) System.out.print("Al menos uno de los numeros es mayor a 10.\n");
    }
    
}
