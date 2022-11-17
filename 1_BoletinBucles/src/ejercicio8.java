import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Dame un numero: ");
        int num = keyboard.nextInt();
        int acumulador = 0;
        
        for (int i = 1; i <= 100; i++) acumulador += num + i;
        System.out.println("La suma de los 100 siguientes es " + acumulador + ".");
    }
    
}
