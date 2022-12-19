package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado13 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("XIII. Leer tres números enteros y diga hay alguno mayor que cero.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = keyboard.nextInt();
        System.out.print("Tercer numero: ");
        int num3 = keyboard.nextInt();
        if ((num1 > 0 | num2 > 0 | num3 > 0) & !(num1 > 0 & num2 > 0 & num3 > 0)) System.out.print("Hay algun numero mayor que 0, pero no todos..\n");
    }
    
}
