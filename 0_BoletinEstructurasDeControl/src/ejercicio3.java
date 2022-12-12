package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Nota del examen: ");
        float input = keyboard.nextFloat();
        if (input >= 5f) System.out.print("Enorabuena, estas aprobado!\n");
        else if (input >= 4f) {
            System.out.print("Nota del trabajo en clase: ");
            input = keyboard.nextFloat();
            if (input >= 8f) System.out.print("Enorabuena, estas aprobado!\n");
            else if (input >= 5) {
                System.out.print("Nota del trabajo practico: ");
                input = keyboard.nextFloat();
                if (input >= 5f) System.out.print("Enorabuena, estas aprobado!\n");
                else System.out.print("Has suspendido.\n");
            }
            else System.out.print("Has suspendido.\n");
        } else System.out.print("Has suspendido.\n");
        
    }
    
}
