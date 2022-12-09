package B4_ClasesObjetos.logica;

public class Ruleta {
    
    private int ultimoGiro = 0;
    public Ruleta() {}
    
    /**
     * Gira la ruleta sin hacer apuestas.
    **/
    public void girar() {
        ultimoGiro = (int) (Math.random() * 36);
    }
    
    /**
     * Apuesta una determinada cantidad a una casilla, devuelve un premio 36 veces mayor a la apuesta.
     * @param cantidad La cantidad a apostar.
     * @param casilla La casilla a la que apostar (entre 0 y 36, incluidos).
     * @return La ganancia de la apuesta (de haber).
    **/
    public int apostar(int cantidad, int casilla) {
        if (casilla < 0 || casilla > 36) return 0;
        girar();
        if (ultimoGiro == casilla) return cantidad * 36;
        else return 0;
    }
    
    /**
     * Apuesta una determinada cantidad a par o impar, devuelve el doble de la apuesta.
     * @param cantidad La cantidad a apostar.
     * @param par ```True``` para apostar a par, ```False``` para impar.
     * @return La ganancia de la apuesta (de haber).
    **/
    public int apostar(int cantidad, boolean par) {
        girar();
        if (ultimoGiro == 0) return 0;
        if (ultimoGiro % 2 == 0 && par) return cantidad * 2;
        else return 0;
    }
}
