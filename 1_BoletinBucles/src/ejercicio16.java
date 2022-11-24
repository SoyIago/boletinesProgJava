package B1_Bucles;
import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int nRandom = (int)(Math.random() * 99), nInput;
        byte tryCount = 1;

        System.out.println("Intenta adivinar el numero, teienes cinco oportunidades.");
        do {
            System.out.print("Intento " + tryCount + ": ");
            tryCount++;
            nInput = keyboard.nextInt();
            if (nInput == nRandom) break;
            else if (nInput > nRandom) System.out.println("Te has pasado.");
            else System.out.println("Te has queadado corto.");
        } while (tryCount <= 5);

        if (tryCount >= 5) System.out.println("Perdiste, el numero era " + nRandom);
        else System.out.println("Acertaste!");
    }
    
}
