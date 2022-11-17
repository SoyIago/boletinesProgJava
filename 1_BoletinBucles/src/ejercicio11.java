package boletinBucles;
import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Numero 'n': ");
        int n = keyboard.nextInt();
        System.out.print("Numero 'm': ");
        int m = keyboard.nextInt();
        
        // Hay que dar la vuelta a las variables si n > m.
        if (n > m) {
            int x = m;
            m = n;
            n = x;
        }
        
        // 'i = n + 1' y 'i < m' porque no nos interesan n y m, si no, seria:
        // for (int i = n; i <= m; i++)
        for (int i = n + 1; i < m; i++) System.out.println(i + " --- " + i + "^2 = " + (i * i));
    }
    
}
