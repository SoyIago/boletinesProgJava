package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio7_2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Introduce un anno: ");
        int anno = keyboard.nextInt();
        
        if (anno % 4 == 0)
            if (anno % 100 != 0 || anno % 400 == 0) System.out.print(anno + " es bisiesto.");
            else System.out.print(anno + " no es bisiesto.");
        else System.out.print(anno + " no es bisiesto.");
    }
    
}
