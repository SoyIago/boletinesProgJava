package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("I. Leer un número entero y determinar si es mayor de 10: ");
        if (keyboard.nextInt() > 10) System.out.print("Es mayor que 10.\n");
    }
    
}
