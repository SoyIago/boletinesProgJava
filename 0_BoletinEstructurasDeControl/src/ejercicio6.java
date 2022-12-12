package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Sistema de ecuaciones:\nax + by = c\ndx + ey = f\n");
        System.out.print("Valor de `a`: ");
        int a = keyboard.nextInt();
        System.out.print("Valor de `b`: ");
        int b = keyboard.nextInt();
        System.out.print("Valor de `c`: ");
        int c = keyboard.nextInt();
        System.out.print("Valor de `d`: ");
        int d = keyboard.nextInt();
        System.out.print("Valor de `e`: ");
        int e = keyboard.nextInt();
        System.out.print("Valor de `f`: ");
        int f = keyboard.nextInt();
        
        int _div = a * e - b * d;
        if (_div != 0) {
            System.out.print("x = " + ((c * e - b * f) / _div) + ".\n");
            System.out.print("y = " + ((a * f - c * d) / _div) + ".\n");
        } else System.out.println("El sistema de ecuaciones no tiene solucion.");
        
    }
    
}
