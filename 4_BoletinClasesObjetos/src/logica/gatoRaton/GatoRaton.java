package B4_ClasesObjetos.logica.gatoRaton;

// NOTA: NO toco de nuevo el codigo de esta clase ni con un palo.

public class GatoRaton {
    private int objX;
    private int objY;
    
    /**
     * Crea una nueva ficha.
     * @param x_init Posicion horizontal de inicializacion de la ficha.
     * @param y_init Posicion vertical de inicialziacion de la ficha,
     **/
    public GatoRaton(int x_init, int y_init) {
        objX = x_init;
        objY = y_init;
    }
    /**
     * Mueve la ficha al azar sin ningun tipo de restricciones.
     * @param steps Numero de pasos permitidos.
     * @return `True` si se movio la ficha, `False` de lo contrario.
     **/
    public boolean setRandomPos(int steps) {
        if (steps <= 0) return false;
        else {
            for (int i = 0; i < steps; i++) {
                int RNG = (int) (Math.random() * 4);
                switch (RNG) {
                    case 0 -> objX++;
                    case 1 -> objY++;
                    case 2 -> objX--;
                    case 3, 4 -> objY--;
                } 
            }
            return true;
        }
    }
    
    /**
     * Corrige la poicion en el tablero, por si la ficha estuviese fuera de sus
     * dimensiones tras moverse.
     * @param table El tablero en el que se esta jugando la partida.
     **/
    public void correctPos(tableroGatoRaton table) {
        this.objX = Math.abs(this.objX) % table.sizeX();
        this.objY = Math.abs(this.objY) % table.sizeY();
    }
    
    /**
     * Suma a las coordenadas de la ficha los valores proporcionados.
     * @param addX El valor a sumar en X.
     * @param addY El valor a sumar en Y.
     **/
    public void setPos(int addX, int addY) {
        objX += addX;
        objY += addY;
    }
    
    /**
     * Obtiene el valor de X.
     * @return Un entero con el valor de X.
     **/
    public int getX() {
        return objX;
    }
    /**
     * Obtiene el valor de Y.
     * @return Un entero con el valor de Y.
     **/
    public int getY() {
        return objY;
    }
    /**
     * Comprueba si dos fichas se encuentran en la misma posicion.
     * @param another Otra ficha.
     * @return `true` si se cumple, `false` de lo contrario.
     **/
    public boolean equals(GatoRaton another) {
        return objX == another.getX() & objY == another.getY();
    }
}
