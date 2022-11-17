import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int ageInput;
        boolean minor = false;
        
        do {
            System.out.print("Dame la edad de un alumno: ");
            ageInput = keyboard.nextInt();
            if (ageInput < 18 && ageInput >= 0) minor = true;
            if (minor) System.out.println("Si, hay algún menor.");
            else System.out.println("No, no hay ningun menor.");
        } while (ageInput != -1);
    }
    
}
