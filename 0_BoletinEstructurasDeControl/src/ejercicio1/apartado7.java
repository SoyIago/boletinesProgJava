package B0_EstructurasDeControl.ejercicio1;
import java.util.Scanner;

public class apartado7 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nVII. Leer dos números enteros y diga si uno y solo uno es mayor de 10.\n");
        System.out.print("Primer numero: ");
        int num1 = keyboard.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = keyboard.nextInt();
        if ((num1 > 10 && num2 < 10) || (num2 > 10 && num1 < 10)) System.out.print("Uno de ellos, y solo uno, es mayor que 10.\n");
    }
    
}
