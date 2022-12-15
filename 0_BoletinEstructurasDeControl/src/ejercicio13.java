package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Dame la nota: ");
        int nota = keyboard.nextInt();
        
        switch (nota) {
            case 1, 2 -> System.out.println("Muy deficiente.");
            case 3, 4 -> System.out.println("Deficiente.");
            case 5, 6 -> System.out.println("Aprobado.");
            case 7, 8 -> System.out.println("Notable.");
            case 9, 10 -> System.out.println("Sobresaliente.");
            default -> System.out.println("Nota no valida.");
        }
        
    }
    
}
