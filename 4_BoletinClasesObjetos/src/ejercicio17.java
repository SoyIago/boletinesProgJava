package B4_ClasesObjetos;
import B4_ClasesObjetos.logica.gatoRaton.tableroGatoRaton;

public class ejercicio17 {

    public static void main(String[] args) {
        tableroGatoRaton juego = new tableroGatoRaton(10,10);
        
        while (juego.mover(true)) {
            System.out.println(juego.imprimir());
        }
    }
    
}
