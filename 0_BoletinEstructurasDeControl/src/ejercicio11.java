package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int limiteMes = 30;
        
        System.out.print("Dame el dia: ");
        int dia = keyboard.nextInt();
        System.out.print("Dame el mes: ");
        int mes = keyboard.nextInt();
        System.out.print("Dame el anno: ");
        int anno = keyboard.nextInt();
        
        // Para evitar errores en la ejecucion el programa manejara tambien fechas
        // ridiculas y devolvera el resultado correcto.
        //
        // Ejemplo: el dia siguiente al 34/14/1999 sera el 06/03/2000
        
        if (mes > 12) {
            anno += mes / 12;
            mes %= 12;
        }
        
        switch (mes) {
            case 2 -> {
                if (anno % 4 == 0 && (anno % 100 != 0 | anno % 400 == 0)) limiteMes = 28;
                else limiteMes = 29;
            }
            case 1, 3, 5, 8, 10, 12 -> limiteMes = 31;
        }
        
        mes += dia / limiteMes;
        dia %= limiteMes;
        
        if (mes > 12) {
            anno += mes / 12;
            mes %= 12;
        }
        
        System.out.println("El proximo dia sera: " + dia + '/' + mes + '/' + anno + '.');
    }
    
}
