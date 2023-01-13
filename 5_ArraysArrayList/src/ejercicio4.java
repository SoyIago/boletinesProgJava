package B5_ArraysArrayList;
import B5_ArraysArrayList.logica.nombreMeses;

public class ejercicio4 {

    static double[] temperaturaMeses = new double[12];
    
    public static void main(String[] args) {
        System.out.print("A. Llenar el array con valor al azar.\n");
        for (int i = 1; i <= temperaturaMeses.length; i++) {
            switch (i) {
                case 1, 2, 3, 11, 12 -> temperaturaMeses[i - 1] = RNGbetween(-10, 20);
                default -> temperaturaMeses[i - 1] = RNGbetween(10, 40);
            }
        }
        
        for (int i = 0; i < temperaturaMeses.length; i++) {
            System.out.format("\t%s: %.1fºC.\n", nombreMeses.nombreMes(i + 1), temperaturaMeses[i]);
        }
        
        System.out.print("B. Mostrar nombre de los meses y su temperatura (clases de Java).\n");
        //TODO
        
        System.out.print("C. Temperatura maxima del año.\n");
        int tempMaxIndex = 0;
        for (int i = 1; i < temperaturaMeses.length; i++) {
            if (temperaturaMeses[i] > temperaturaMeses[tempMaxIndex]) tempMaxIndex = i;
        }
        System.out.printf("\tLa temperatura máxima fue en %s: %+.1fºC.\n", 
                nombreMeses.nombreMes(tempMaxIndex + 1) , 
                temperaturaMeses[tempMaxIndex]
        );
    }
    
    private static double RNGbetween(float max, float min) {
        if (min > max) {
            float _temp = max;
            max = min;
            min = _temp;
        }
        return (Math.random() * (Math.abs(max) + Math.abs(min))) - Math.abs(min);
    }
    
}
