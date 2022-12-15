package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int r;
        System.out.print("Valor para A: ");
        int a = keyboard.nextInt();
        System.out.print("Valor para B: ");
        int b = keyboard.nextInt();
        
        
        // NOTA GENERAL
        // Debido a que se esta usando el tipo `int` los valores se truncan,
        // queriendo decir esto, que, por ejemplo, si indicamos por valor `A`
        // el numero `12` y para `B` el `4` la operacion resultara en `0`, ya
        // que no se tienen en cuenta los decimales, que si aparecerian en una
        // operacion matematica en papel, o bien usando el tipo `float.
        
        // Version A
        // No hace nada si `B` no es distinto de `0` y si `A / B` no es igual a 
        // `0`.  Han de darse ambas condiciones para que se ejecute el fragmento 
        // de codigo del interior del `if`, y si la primera condicion no se 
        // cumple, no se ejecuta la segunda. Evitando una division entre 0.
        
        if (b != 0 && a / b == 0) {
            r = a / b; 
            System.out.println("VER A: " + r);
        }
        // Version B 
        // No hace nada si `A / B` no es cero o si `B` no es distinto de `0`.
        // Aunque sintacticamente es correcto, logicamente se le pide a Java
        // que compruebe la division primero, lo que implica que si el divisor
        // es 0 (en este caso la variable `b`, el programa se cerrara con un
        // error inesperado, pues no se pueden hacer divisiones entre 0.
        
        if (a / b == 0 && b != 0) {
            r = a / b;
            System.out.println("VER B: " + r);
        }
        
        // Version C
        // Exactamente igual que la `Version A` pero, en este caso, aunque `b`
        // sea `0` se le esta indicando a Java que tambien verifique la segunda
        // condiciones en lugar de para la ejecucion ante un `false`, lo que 
        // resulta en que el programa se cierre con un error inesperado cuando 
        // `b` es `0`.
        
        if (b != 0 & a / b == 0) {
            r = a / b;
            System.out.println("VER C: " + r);
        }
    }
    
}
