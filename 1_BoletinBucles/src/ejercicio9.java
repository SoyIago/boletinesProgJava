import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int acumulador = 0;
        
        do {
            System.out.print("Dame un numero: ");
            acumulador += keyboard.nextInt();
            System.out.println("Acumulado: " + acumulador);
        } while (acumulador <= 100);
        
        System.out.println("Has superado el limite de 100.");
    }
    
}
