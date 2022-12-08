package B4_ClasesObjetos;
import B4_ClasesObjetos.logica.Ruleta;

public class ejercicio15 {

    public static void main(String[] args) {
        Ruleta ruleta = new Ruleta();
        
        int credito = 10000;
        for (int i = 0; i < 10000; i++) {
            if (credito - 1 > 0) {
                credito--;
                credito += ruleta.apostar(1, true);
            }
        }
        System.out.format("Has acabado con %dE.", credito);
    }
    
}
