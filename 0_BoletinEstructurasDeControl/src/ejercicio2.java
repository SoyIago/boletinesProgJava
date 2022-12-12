package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Numero 1: ");
        int num1 = keyboard.nextInt();
        System.out.print("Numero 2: ");
        int num2 = keyboard.nextInt();
        System.out.print("Numero 3: ");
        int num3 = keyboard.nextInt();
        
        if (num1 < 0 && num2 < 0 && num3 < 0) System.out.print("Producto: " + (num1 * num2 * num3) + ".\n");
        else if (num1 >= 0 && num2 >= 0 && num3 >= 0) System.out.print("Suma multiplicada por" + num3 +": " + ((num1 + num2 + num3) * num3) + ".\n");
        else System.out.print("Suma: " + (num1 + num2 + num3) + ".\n");
        
        // ¿existe alguna combinación de los valores leídos no contemplado 
        //  No, el algoritmo contempla todos los casos posibles:
        //  Todos negativos, todos positivos, y si no se cumple ninguna de las
        //  dos es porque se cumple que alguno sea negativo y/o positivo.
        //  
        //  Teniendo en cuenta lo anterior es mejor reformular el algoritmo
        //  y eliminar la condicion mas compleja: `Si alguno es negativo, pero 
        //  no todos, mostrar la suma de los tres`. que seria:
        //
        //      `if ((num1 >= 0 || num2 >= 0 || num3 >= 0) &&
        //          !(num1 >= 0 && num2 >= 0 && num3 >= 0))`
        //
        //  Puesto que consume demasiado tiempo de CPU, puesto que tiene
        //  demasiadas operaciones logicas.
        
    }
    
}
