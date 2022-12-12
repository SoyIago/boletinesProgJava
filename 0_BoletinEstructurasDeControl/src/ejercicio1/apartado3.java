package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("III. Leer un número entero y de determinar si se trata de un número par o impar:\n");
        System.out.print("Numero: ");
        if (keyboard.nextInt() % 2 == 0) System.out.print("Es par.\n");
        else System.out.print("Es impar.\n");
    }
    
}
