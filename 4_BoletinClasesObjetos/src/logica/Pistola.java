package B4_ClasesObjetos.logica;

public class Pistola {
    
    private boolean tamborDescargado = true;
    private byte posicionMartillo = 0;
    private final byte capacidadTambor = 6;
    
    public Pistola() {}
    
    /**
     * Efectua el disparo.
     * @return Devuelve ```True``` si la posicion del martillo coincidia con la de la bala, ```False``` de lo contrario o si no hay una bala cargada.
    **/
    public boolean disparar() {
        if (tamborDescargado) return false;
        if (posicionMartillo == 0) {
            tamborDescargado = true;
            return true;
        }
        if ((posicionMartillo + 1) < capacidadTambor) posicionMartillo++;
        else posicionMartillo = 0;
        return false;
    }
    
    /**
     * Carga una bala en la primera posicion del revolver y gira el tambor.
     * @return Devuelve ```True``` si se pudo cargar la bala, ```False``` si ya hay una cargada.
    **/
    public boolean cargarBala() {
        if (tamborDescargado) tamborDescargado = false;
        else return false;
        girarTambor();
        return !tamborDescargado;
        
    }
    
    /**
     * Gira el tambor del revolver, el martillo caera en una posicion aleatoria.
    **/
    public void girarTambor() {
        posicionMartillo = (byte) ((byte) (Math.random() * 6) % capacidadTambor);
    }
    /**
    * Comprueba que el tambor este descargado.
    * @return Devuelve ```True``` si esta descargado, ```False``` si esta cargado.
    **/
    public boolean estaDescargada() {
        return tamborDescargado;
    }
}
