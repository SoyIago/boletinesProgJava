package B3_Funciones;
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int stNum, ndNum;
        
        System.out.print("Primer numero: ");
        stNum = cantidadDivisores(keyboard.nextInt());
        System.out.print("Segundo numero: ");
        ndNum = cantidadDivisores(keyboard.nextInt());
        
        if (stNum < ndNum) System.out.println("El segundo numero tiene mas dividores.");
        else if (stNum > ndNum) System.out.println("El primer numero tiene mas divisores.");
        else System.out.println("Ambos tienen el mismo numero de divisores.");
    }

    public static byte cantidadDivisores(int numero) {
        ArrayList<Integer> primes =  new ArrayList<>();
        
        for (int i = 2; i < numero; i++) {
            boolean isPrime = true;
            
            for (int j = 0; j < primes.size(); j++) {
                int _currentPrime = primes.get(j);  // Evitar llamada duplicada a primes.get(j).
                if ((_currentPrime / 2) > i) break;
                if (i % _currentPrime == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) primes.add(i);
        }

        // Todo numero tiene de dividores el 1 y el mismo, entonces, si el numero no es '1'
        // siempre tiene dos divisores, por eso se inicializa el contador en '1' o '2'.
        byte contador;
        if (numero == 1) contador = 1;
        else contador = 2;
        
        for (int i = 0; i < primes.size(); i++) {
            if (numero % primes.get(i) == 0) contador++;
        }
        
        return contador;
    }
    
}
