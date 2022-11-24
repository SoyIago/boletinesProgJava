package B1_Bucles;

public class ejercicio21 {

    public static void main(String[] args) {
        int ant = 1, ant2 = 0, num;
        System.out.println("0");
        System.out.println("1");
        //for (int i = 1; i <= 12; i++) {
        for (int i = 1; i <= 10; i++) {
            num = ant + ant2;
            System.out.println(num);
            ant2 = ant; ant = num;
            //ant = num; ant2 = ant;
        }
    }

}
