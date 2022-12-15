package B0_EstructurasDeControl;
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Primera fecha:\n");
        System.out.print("Dame el dia: ");
        int stDia = keyboard.nextInt();
        System.out.print("Dame el mes: ");
        int stMes = keyboard.nextInt();
        System.out.print("Dame el anno: ");
        int stAnno = keyboard.nextInt();
        
        System.out.println("\nSegunda fecha:\n");
        System.out.print("Dame el dia: ");
        int ndDia = keyboard.nextInt();
        System.out.print("Dame el mes: ");
        int ndMes = keyboard.nextInt();
        System.out.print("Dame el anno: ");
        int ndAnno = keyboard.nextInt();
        
        
        if ((stAnno > ndAnno) || (stAnno < ndAnno && (stMes > ndMes || stMes < ndMes && stDia < ndDia))) 
            System.out.println("" + stDia + '/' + stMes + '/' + stAnno + " es mayor que " + ndDia + '/' + ndMes + '/' + ndAnno + '.');
        else
            System.out.println("" + stDia + '/' + stMes + '/' + stAnno + " es menor que " + ndDia + '/' + ndMes + '/' + ndAnno + '.');
    }
    
}
