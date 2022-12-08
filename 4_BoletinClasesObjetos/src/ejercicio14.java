package B4_ClasesObjetos;
import B4_ClasesObjetos.logica.Pistola;

public class ejercicio14 {

    public static void main(String[] args) {
        Pistola magnum = new Pistola();
        System.out.print("Ruleta rusa...\n\n");
        
        if (magnum.cargarBala()) System.out.print("La bala esta cargada.\n");
        
        // True == jugador2 y Flase == jugador1;
        boolean ultimoEnDisparar = (int) (Math.random() * 10) % 2 != 0;
        
        if (ultimoEnDisparar) System.out.print("Empieza jugador2...\n");
        else System.out.print("Empieza jugador1...\n");
        
        boolean disparo = false;
        while (!disparo) {
            disparo = magnum.disparar();
            if (ultimoEnDisparar) System.out.print("Jugador2 se dispara...\n");
            else System.out.print("Jugador1 se dispara...\n");
            if (!disparo) ultimoEnDisparar = !ultimoEnDisparar;
        }
        
        if (ultimoEnDisparar) System.out.print("Jugador2 ha muerto.\n");
        else System.out.print("Jugador1 ha muerto.\n"); 
    }
    
}
