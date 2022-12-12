package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Horas: ");
        byte horas = keyboard.nextByte();
        System.out.print("Minutos: ");
        byte minutos = keyboard.nextByte();
        System.out.print("Segundos: ");
        byte segundos = keyboard.nextByte();
        
        if (horas > 23 || minutos > 59 || segundos > 59) System.out.print("No has introducido una hora valida.\n");
        else System.out.print(((horas * 3600) + (minutos * 60) + segundos) + " segundos transcurridos.\n");
    }
    
}
