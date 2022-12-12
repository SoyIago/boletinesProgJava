package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Coordenada X: ");
        int x = keyboard.nextInt();
        System.out.print("Coordenada Y: ");
        int y = keyboard.nextInt();
        
        // Valor absoluto
        if (x < 0) x = x * -1;
        if (y < 0) x = x * -1;
        
        if (x == y) System.out.print("Es un cuadrado, ");
        else System.out.print("Es un rectangulo, ");
        
        System.out.print("Y su area es " + (x * y) + ".\n");
        
    }
    
}
