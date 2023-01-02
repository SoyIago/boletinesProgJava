package B4_ClasesObjetos.logica.gatoRaton;

// NOTA: NO toco de nuevo el codigo de esta clase ni con un palo.
// NOTA 2: Ni para comentarlo.

public class tableroGatoRaton {
    private final int tableroX;
    private final int tableroY;
    private final GatoRaton catObj;
    private final GatoRaton mouseObj;
    private final char celdaGato = 'G';
    private final char celdaRaton = 'R';
    private final char celdaVacia = '#';
    
    private int distanciaGRX;
    private int distanciaGRY;
    
    private int movimientos = 0;
    
    /**
     * Crea un nuevo tablero.
     * @param x Tamano horizontal.
     * @param y Tamano vertical.
     **/
    public tableroGatoRaton(int x, int y) {
        tableroX = x;
        tableroY = y;
        
        catObj = new GatoRaton((int) (Math.random() * x), (int) (Math.random() * y));
        mouseObj = new GatoRaton((int) (Math.random() * x), (int) (Math.random() * y));
        
        actualizarDistancia();
    }
    
    public int sizeX() {
        return tableroX;
    }
    
    public int sizeY() {
        return tableroY;
    }
    
    private void actualizarDistancia() {
        int _mouseX = mouseObj.getX();
        int _mouseY = mouseObj.getY();
        int _catX = catObj.getX();
        int _catY = catObj.getY();
        
        int dist1 = _mouseX - _catX;
        int dist2 = Math.abs(_mouseX - tableroX - _catX);
        
        int dist3 = _mouseY - _catY;
        int dist4 = Math.abs(_mouseY - tableroX - _catY);
        
        distanciaGRX = Math.min(dist1, dist2);
        distanciaGRY = Math.min(dist3, dist4);

    }
    
    public String imprimir() {
        String tableResult = "";
        
        for (int x = 0; x < tableroX; x++) {
            for (int y = 0; y < tableroY; y++) {
                if (catObj.getX() == x & catObj.getY() == y) tableResult += celdaGato;
                else if (mouseObj.getX() == x & mouseObj.getY() == y) tableResult += celdaRaton;
                else tableResult += celdaVacia;
            }
            tableResult = tableResult.concat("\n");
        }
        
        return tableResult;
    }
    
    public boolean mover(boolean printMovements) {
        int lastMouseX = mouseObj.getX();
        int lastMouseY = mouseObj.getY();
        int lastCatX = catObj.getX();
        int lastCatY = catObj.getY();
        
        if (lastMouseX == lastCatX & lastMouseY == lastCatY) return false;
        
        if (mouseObj.setRandomPos(2)) {
            mouseObj.correctPos(this);
            this.movimientos++;
            if (printMovements) System.out.format("[Jugada #%d] Raton: se movio desde (%d, %d) a (%d, %d).\n",
                    this.movimientos, lastMouseX, lastMouseY, mouseObj.getX(), mouseObj.getY());
            actualizarDistancia();
        }

        // Probablemente la peor IA jamas escrita.
        if (distanciaGRX >= distanciaGRY) catObj.setPos(-1, 0);
        else catObj.setPos(0, -1);
        catObj.correctPos(this);
        this.movimientos++;
        actualizarDistancia();
        
        if (printMovements) System.out.format("[Jugada #%d] Gato: se movio desde (%d, %d) a (%d, %d).\n",
                    this.movimientos, lastCatX, lastCatY, catObj.getX(), catObj.getY());

        return true;
    }
}
