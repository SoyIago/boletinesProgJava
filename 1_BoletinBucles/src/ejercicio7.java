package B1_Bucles;
import java.util.Scanner;
/*
    Este programa devuelve los divisores del numero introducido, que se encuentre
    entre 0 y 1000, ambos incluidos, tiene errores que se explica mas abajo.
*/
public class ejercicio7 {

    public static void main(String[] args) {
/*
        Cambiada la forma de inicializar num, no un error, pero asi ocupa menos
        y no se resta funcionalidad.
*/

//      int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
//      num = teclado.nextInt();
        int num = teclado.nextInt();
/*
        La comprobación de la entrada de datos está mal formulada.
*/
//      if (num < 0 && num > 1000) {
        if (num <= 1 || num >= 1000) System.out.println("Numero incorrecto.");
        else {
            System.out.println(num);
/*
            La condicion del bucle no tiene sentido: no se puede usar como
            condicion 'num' porque no se altera nunca, por lo que el bucle
            queda en ejecucion para siempre dandole la vuelta a 'num', lo que
            acaba causando una divisón entre 0, por lo que el programa peta.
*/
//          for (int i=num;num>=1;i--)
            for (int i = num / 2; i >= 1; i--) if (num % i == 0) System.out.println(i);
            
        }
    }

}
