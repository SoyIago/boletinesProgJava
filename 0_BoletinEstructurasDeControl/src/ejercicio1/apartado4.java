package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("IV. Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        if (num1 > 10 & keyboard.nextInt() > 10) System.out.print("Ambos numeros son mayores a 10.\n");
        else System.out.print("Alguno de los numeros no es mayor a 10.\n");
    }
    
}
