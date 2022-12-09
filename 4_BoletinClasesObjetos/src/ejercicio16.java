package B4_ClasesObjetos;
import B4_ClasesObjetos.logica.Examen;
import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String keyboardInput;
        
        System.out.print("Respuestas del examen: ");
        Examen examen = new Examen(keyboard.nextLine());
        
        do {
            System.out.print("Respuetas del alumno: ");
            keyboardInput = keyboard.nextLine();
            if (examen.registrarRespuestas(keyboardInput))
                System.out.format("A este alumno le corresponde un %f.\n", examen.evaluar());
            else if (!keyboardInput.toUpperCase().equals("SALIR"))
                System.out.print("Entrada de respuestas invalida.\n");
        } while (!keyboardInput.toUpperCase().equals("SALIR"));
    }
    
}
