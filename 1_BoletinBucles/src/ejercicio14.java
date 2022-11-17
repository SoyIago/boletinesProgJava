import java.util.ArrayList;

public class ejercicio14 {

    public static void main(String[] args) {
        // 1 no puede ser un número perfecto porque solo es divisor de si mimso, entonces i = 2.
        // 2 y 3 son números primos, y solo se dividen entre ellos mismos y uno, entonces i = 4.
        for (int i = 4; i < 1000; i++) {
            // Un numero perfecto ha de ser siempre par.
            if (i % 2 == 0) {
                ArrayList<Integer> divisores = new ArrayList<>();
                // Comprobar los divisores, saltamos el propio número como divisor, j > 2 porque
                // 1 es divisor de todos los números y 2 es divisor de todos los pares.
                for (int j = i / 2; j > 2; j--) if (i % j == 0) divisores.add(j);
                // Sumar los divisores para ver si SumaDivisores = numero, se inicializa en 3 porque
                // 1 es divisor de todos los números y 2 es divisor de todos los pares: 1 + 2 = 3.
                int sumaDivisores = 3;
                for (int j = 0; j < divisores.size(); j++) sumaDivisores += divisores.get(j);
                if (sumaDivisores == i) System.out.println(i + " es un numero perfecto.");
            }
        }
    }
    
}
