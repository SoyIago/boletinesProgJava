import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float numInput;
        ArrayList<Float> notas = new ArrayList<>();
        
        do  {
            System.out.print("Dame una nota: ");
            numInput = keyboard.nextFloat();
            
            if (numInput >= 0.0f && numInput <= 10.0f) notas.add(numInput);
            else if (numInput != -1.0f) System.out.println("La nota " + numInput + " no es valida.");

        } while (numInput != -1.0f || notas.size() < 1);
        
        float max = 0.0f, min = 10.0f, media = 0.0f;
        boolean cincoE = false;
        
        for (int i = 0; i < notas.size(); i++) {
            float _nota = notas.get(i);
            if (max < _nota) max = _nota;
            if (min > _nota) min = _nota;
            if (_nota == 5.0f) cincoE = true;
            media += _nota;
        }
        
        System.out.println("Total de notas: " + notas.size());
        System.out.println("La nota maxima fue: " + max);
        System.out.println("La nota minima fue: " + min);
        
        if (cincoE) System.out.println("Hay algun cinco exacto.");
        
        System.out.println("La nota media fue " + (media / notas.size()));
        
    }
    
}
