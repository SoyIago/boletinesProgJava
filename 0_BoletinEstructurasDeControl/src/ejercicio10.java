package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Dame el dia: ");
        byte dia = keyboard.nextByte();
        System.out.print("Dame el mes: ");
        byte mes = keyboard.nextByte();
        System.out.print("Dame el anno: ");
        int anno = keyboard.nextInt();
        
        if (anno == 0 || mes > 12 || mes < 1 || dia < 1 || dia > 31) System.out.print("Fecha invalida.\n");
        else switch (mes) {
            case 2 -> {
                if (dia > 29 && (mes % 4 == 0 && (mes % 100 != 0 || mes % 400 == 0))) System.out.print("Fecha invalida.\n");
                else System.out.print("Fecha correcta.\n");
            }
            case 4, 6, 9, 11 -> {
                if (dia > 30) System.out.print("Fecha invalida.\n");
                else System.out.print("Fecha correcta.\n");
            }
            default -> System.out.print("Fecha correcta.\n");
        }
    }
    
}
