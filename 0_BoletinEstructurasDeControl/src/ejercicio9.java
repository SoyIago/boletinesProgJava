package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Dame una hora: ");
        int hora = keyboard.nextInt();
        
        switch (hora) {
            case 9, 11, 13 -> System.out.print("Tienes salida el Domingo..\n");
            case 10 -> System.out.print("Tienes salida de Lunes a Domingo.\n.");
            case 12 -> System.out.print("Tienes salida el Jueves y el Domingo.\n");
            case 14 -> System.out.print("Tienes salida de Lunes a Viernes y el Domingo.\n");
            default -> System.out.print("No hay salidas programadas para las " + hora + ".\n");
        }
    }
    
}
