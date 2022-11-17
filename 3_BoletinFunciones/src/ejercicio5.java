package boletinFunciones;

public class ejercicio5 {

    public static void main(String[] args) {
        System.out.println(factorialLimite((byte) 20));
    }
    
    public static long factorial(int numero) {
        int acumulador = 1;
        for (int i = numero; i > 0; i--) {
            acumulador *= i;
        }
        return acumulador;
    }
    
    public static long factorialLimite(byte numero) {
        if (numero > 20 || numero <= 1) return -1;
        else return factorial(numero);
    }
}