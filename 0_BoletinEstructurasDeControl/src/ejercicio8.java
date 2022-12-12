package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Dame un dia (1-7): ");
        byte dia = keyboard.nextByte();
        System.out.print("Dame una hora (9-14): ");
        byte hora = keyboard.nextByte();
        
        if (hora > 14 || hora < 9 || dia > 7 || dia < 1) System.out.print("Has introducido datos invalidos.\n");
        else {
            if (hora == 10 || dia == 7 || (hora == 14 && dia != 6) || (hora == 12 && dia == 4))
                System.out.print("Pasara el bus.\n");
            else System.out.print("No hay bus para la salida especificada.");
        }
    }
    
}
