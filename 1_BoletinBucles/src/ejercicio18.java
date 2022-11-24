package B1_Bucles;

public class ejercicio18 {

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("Tabla del " + i +": ");
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
    
}
