package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado5 {

    public static void main(String[] args) {
        Scanner keyboard =  new Scanner(System.in);
        System.out.print("V. Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        if (num1 > 10 | keyboard.nextInt() > 0) System.out.print("Al menos uno de los numeros es mayor a 10.\n");
    }
    
}
