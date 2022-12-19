package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("VI. Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).\n");
        System.out.print("Numero: ");
        int num1 = keyboard.nextInt();
        if (num1 >= 10 & num1 <= 20) System.out.print("El numero esta comprendido entre 10 y 20.\n");
    }
    
}
