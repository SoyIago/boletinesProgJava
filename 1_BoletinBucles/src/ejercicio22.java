package B1_Bucles;
import java.util.Scanner;

public class ejercicio22 {

    public static void main(String[] args) {
        int totalSales = 0, topSalary = 0;
        boolean dontStop = true;
        Scanner keyboard = new Scanner(System.in);
        
        do {
            System.out.print("Sueldo base del empleado: ");
            int salary = keyboard.nextInt();
            System.out.print("Horas extra del empleado: ");
            byte extraHours = keyboard.nextByte();
            System.out.print("Ventas del empleado: ");
            byte sales = keyboard.nextByte();
            
            if (sales >= 10) salary += 500;
            if (sales >= 21) salary += 500;
            if (sales >= 30) salary += 300;
            
            totalSales += sales;
            salary += extraHours * 100;
            
            if (salary > topSalary) topSalary = salary;
            
            System.out.println("Sueldo del empleado: " + salary);
            
            boolean askContinue = true;
            
            System.out.print("Continuar (S/N): ");
            do {
                String keyboardResponse = keyboard.nextLine().toUpperCase();
                if (keyboardResponse.startsWith("S")) askContinue = false;
                else if (keyboardResponse.startsWith("N")) {
                    askContinue = false;
                    dontStop = false;
                }
            } while (askContinue);
            
        } while (dontStop);
        
        System.out.println("El sueldo más alto fue " + topSalary + ", el total de ventas fue " + totalSales);
    }
    
}
