import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i; // Vamos a consultar i al salir del bucle para ahorrar tiempo de CPU.
        
        System.out.println("Dame tus notas...");
        for (i = 1; i < 10; i++) {
            System.out.print("Modulo " + i + ": ");
            int nota = keyboard.nextInt();
            if (nota < 5) {
                System.out.println("No puedes ir a hacer la FCT, tiene que aprobar TODO!");
                break;
            }
        }
        
        if (i <= 10) System.out.println("Enorabuena, puedes or a hacer la FCT!");
    }
    
}
