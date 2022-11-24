package B1_Bucles;
import java.util.ArrayList;

public class ejercicio20 {

    public static void main(String[] args) {
        ArrayList<Integer> primes =  new ArrayList<>();
        
        /* 'i' empieza en 2 porque 1 parece cumplir todos los criterios de un 
        número primo pero no lo es, ya que solo cuenta con un divisor, no
        merece la pena el tiempo de CPU extra que hace falta para esta unica
        excepción.*/
        
        for (int i = 2; i < 1000; i++) {
            // Por defecto cualquier número es primo.
            boolean isPrime = true;
            /* Recorremos toda la lista de numeros primos para ver si 'i' puede
            ser divido entre alguno de ellos, si puede ser divido: 'i' no es primo,
            como no necesitamos ver si es divisible entre otro numero, salimos del
            bucle.
            
            Si 'i' es más peque?o que el número contra el que estamos haciendo la 
            comprobación, tambien salimos del bucle, es imposible que se pueda dividir.
            */
            
            // if (i == 1) break; //Explicado arriba porque nos saltamos este paso.
            
            for (int j = 0; j < primes.size(); j++) {
                int _currentPrime = primes.get(j);  // Evitar llamada duplicada a primes.get(j).
                if ((_currentPrime / 2) > i) break;
                if (i % _currentPrime == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // Si 'i' es primo, avisamos y lo guardamos en la lista de numeros primos.
            if (isPrime) {
                System.out.println(i + " es primo.");
                primes.add(i);
            }
        }
        System.out.println("Obtenidos " + primes.size() + " números primos.");
    }
    
}
