package B5_ArraysArrayList;
import B5_ArraysArrayList.logica.nombreMeses;

public class ejercicio1 {

    static int[] temperaturaMeses = new int[12];
    
    public static void main(String[] args) {
        
        System.out.print("A. Rellenando con temperaturas aleatorias...\n");
        for (int tempMes = 0; tempMes < temperaturaMeses.length; tempMes++) {
            temperaturaMeses[tempMes] = (int) (Math.random() * 40);
        }
        
        System.out.print("B. Contenido del Array `temperaturaMeses`:\n");
        for (int tempMes = 0; tempMes < temperaturaMeses.length; tempMes++) {
            System.out.format("\t%s: %d?C\n", nombreMeses.nombreMes(tempMes + 1), temperaturaMeses[tempMes]);
        }
        
        System.out.print("C. Contenido del Array `temperaturaMeses` en orden inverso:\n");
        for (int tempMes = temperaturaMeses.length - 1; tempMes > 0; tempMes--) {
            System.out.format("\t%s: %d?C\n", nombreMeses.nombreMes(tempMes + 1), temperaturaMeses[tempMes]);
        }
    }

}
