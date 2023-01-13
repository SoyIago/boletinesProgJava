package B5_ArraysArrayList;
import B5_ArraysArrayList.logica.nombreMeses;

public class ejercicio3 {

    static int[] temperaturaMeses = new int[12];
    
    public static void main(String[] args) {
        for (int i = 0; i < temperaturaMeses.length; i++) {
            final int RNG = (int) (Math.random() * 40);
            int j;
            temperaturaMeses[i] = RNG;
            // Recorrer el array para ver si hay alguna coincidencia.
            // Si aparece alguna restar 1 a `ì`.
            for (j = 0; j < i; j++) {
                if (temperaturaMeses[j] == RNG) {
                    i--;
                    break;
                }
            }
        }
        
        System.out.print("Resultado:\n");
        for (int i = 0; i < temperaturaMeses.length; i++) {
            System.out.format("\t%s: %dºC.\n", nombreMeses.nombreMes(i + 1), temperaturaMeses[i]);
        }
    }
    
}
