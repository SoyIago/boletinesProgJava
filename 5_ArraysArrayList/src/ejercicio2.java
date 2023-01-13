package B5_ArraysArrayList;
import B5_ArraysArrayList.logica.nombreMeses;

public class ejercicio2 {

    static int[] temperaturaMeses = new int[12];
    
    public static void main(String[] args) {
        
        System.out.print("A. Rellenando con temperaturas aleatorias...\n");
        for (int tempMes = 0; tempMes < temperaturaMeses.length; tempMes++) {
            temperaturaMeses[tempMes] = (int) (Math.random() * 30);
        }
        
        System.out.print("B. Mostrar la temperatura media del a?o.\n");
        int tempMedia = 0;
        for (int tempMes = 0; tempMes < temperaturaMeses.length; tempMes++) {
            tempMedia += temperaturaMeses[tempMes];
        }
        tempMedia /= temperaturaMeses.length;
        System.out.format("\tTemperatura media: %d?C.\n", tempMedia);
        
        System.out.print("C. Mostrar los meses en los que hizo más de `30` grados.\n");
        String mesesCalidos = "";
        for (int tempMes = 0; tempMes < temperaturaMeses.length; tempMes++) {
            if (temperaturaMeses[tempMes] > 30) mesesCalidos += nombreMeses.nombreMes(tempMes + 1).concat(", ");
        }
        if (mesesCalidos.length() > 0) System.out.format("\tLos meses cálidos fueron: %s.\n", 
                mesesCalidos.substring(0, mesesCalidos.length() - 2));
        
        System.out.print("D. Decir si hay algún mes con más de `30` grados, recorrer lo imprescindible el array.\n");
        boolean noHayMesCalido1 = true;
        for (int tempMes = 0; tempMes < temperaturaMeses.length; tempMes++) {
            if (temperaturaMeses[tempMes] > 30) {
                System.out.print("\tHay algún mes con más de `30` grados.\n");
                noHayMesCalido1 = false;
                break;
            }
        }
        if (noHayMesCalido1) System.out.print("No hay meses con más de 30?C.");
        
        System.out.print("E. Decir si hay algún mes con más de `30` grados, recorrer lo imprescindible el array, sin usar `break` ni `return`.\n");
        boolean noHayMesCalido2 = true;
        for (int tempMes = 0; tempMes < temperaturaMeses.length; tempMes++) {
            if (temperaturaMeses[tempMes] > 30) {
                System.out.print("\tHay algún mes con más de `30` grados.\n");
                noHayMesCalido2 = false;
                tempMes = temperaturaMeses.length;  // Salir del bucle rompiendo la condición de permanencia.
            }
        }
        if (noHayMesCalido2) System.out.print("No hay meses con más de 30?C.");
        
        System.out.print("F. Decir si hay una temperatura repetida en dos o más meses.\n");
        int repeticiones = 0;
        for (int tempMes = 0; tempMes < temperaturaMeses.length - 1; tempMes++) {
            for (int tempMesComp = tempMes + 1; tempMesComp < temperaturaMeses.length; tempMesComp++) {
                if (temperaturaMeses[tempMes] == temperaturaMeses[tempMesComp]) repeticiones++;
                if (repeticiones > 3) break;
            }
            if (repeticiones > 3) break;
        }
        switch (repeticiones) {
            case 00 -> System.out.print("No hay repeticiones.\n");
            case 01 -> System.out.print("Hay una temperatura repetida.\n");
            case 02 -> System.out.print("Hay dos temperaturas repetidas.\n");
            default -> System.out.print("Hay tres o más temperaturas repetidas.\n");
        }
    }
    
}
