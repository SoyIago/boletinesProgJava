package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Introduce un DNI (sin letra): ");
        int numDNI = keyboard.nextInt();
        
        if (numDNI > 99999999 || numDNI < 0) System.out.print("Numero invalido.\n");
        else switch (numDNI % 23) {
            case 0 -> System.out.print("El DNI con letra seria " + numDNI + "T.\n");
            case 1 -> System.out.print("El DNI con letra seria " + numDNI + "R.\n");
            case 2 -> System.out.print("El DNI con letra seria " + numDNI + "W.\n");
            case 3 -> System.out.print("El DNI con letra seria " + numDNI + "A.\n");
            case 4 -> System.out.print("El DNI con letra seria " + numDNI + "G.\n");
            case 5 -> System.out.print("El DNI con letra seria " + numDNI + "M.\n");
            case 6 -> System.out.print("El DNI con letra seria " + numDNI + "Y.\n");
            case 7 -> System.out.print("El DNI con letra seria " + numDNI + "F.\n");
            case 8 -> System.out.print("El DNI con letra seria " + numDNI + "P.\n");
            case 9 -> System.out.print("El DNI con letra seria " + numDNI + "D.\n");
            case 10 -> System.out.print("El DNI con letra seria " + numDNI + "X.\n");
            case 11 -> System.out.print("El DNI con letra seria " + numDNI + "B.\n");
            case 12 -> System.out.print("El DNI con letra seria " + numDNI + "N.\n");
            case 13 -> System.out.print("El DNI con letra seria " + numDNI + "J.\n");
            case 14 -> System.out.print("El DNI con letra seria " + numDNI + "Z.\n");
            case 15 -> System.out.print("El DNI con letra seria " + numDNI + "S.\n");
            case 16 -> System.out.print("El DNI con letra seria " + numDNI + "Q.\n");
            case 17 -> System.out.print("El DNI con letra seria " + numDNI + "V.\n");
            case 18 -> System.out.print("El DNI con letra seria " + numDNI + "H.\n");
            case 19 -> System.out.print("El DNI con letra seria " + numDNI + "L.\n");
            case 20 -> System.out.print("El DNI con letra seria " + numDNI + "C.\n");
            case 21 -> System.out.print("El DNI con letra seria " + numDNI + "K.\n");
            case 22 -> System.out.print("El DNI con letra seria " + numDNI + "E.\n");
        }
    }
    
}
