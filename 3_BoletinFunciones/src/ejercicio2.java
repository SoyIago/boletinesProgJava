package boletinFunciones;
import java.util.Scanner;

public class ejercicio2 {
    
    private static double circleArea(float radius) {
        return Math.PI * radius * radius;
    }
    
    private static float rectangleArea (float side1, float side2) {
        return side1 * side2;
    }
    
    private static float squareArea (float side) {
        return rectangleArea(side, side);
    }
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        do {
            System.out.println("A. Area del circulo (necesito el radio).");
            System.out.println("B. Area del rectangulo (necesito base y altura).");
            System.out.println("C. Area del cuadrado (necesito lado).");
            System.out.println("E. Salir.");
            
            System.out.print("\n-> ");
            input = keyboard.nextLine();
            
            String[] argsOfInput = input.toUpperCase().split(" ");
            
            switch (argsOfInput[0]) {
                case "A" -> System.out.println("Area del circulo = " + 
                        circleArea(Float.parseFloat(argsOfInput[1])) + "u.");
                case "B" -> System.out.println("Area del rectangulo = " + 
                        rectangleArea(Float.parseFloat(argsOfInput[1]), Float.parseFloat(argsOfInput[2])) + "u.");
                case "C" -> System.out.println("Area del cuadrado = " + 
                        squareArea(Float.parseFloat(argsOfInput[1])) + "u.");
                case "E" -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion " + argsOfInput[0] + " desconocida.");
            }
        } while (input.toUpperCase().charAt(0) != 'E');
    }
    
}
