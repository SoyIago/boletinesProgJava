package B4_ClasesObjetos;
import java.util.Scanner;
import B4_ClasesObjetos.logica.MasterMind;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        MasterMind juego = new MasterMind(4);
        
        while (!juego.partidaGanada()) {
            System.out.print("Dame una combinacion: ");
            System.out.print(juego.comprobar(keyboard.nextLine()));
        }
        
        System.out.print("\nAcertaste la combinacion!\n");
    }
    
}
