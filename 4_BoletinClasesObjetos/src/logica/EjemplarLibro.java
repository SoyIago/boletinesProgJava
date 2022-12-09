package B4_ClasesObjetos.logica;
import java.time.LocalDate;

public class EjemplarLibro {
    private final String title;
    private final LocalDate registryDate;
    private int issueNumber;
    private boolean isBorrowed;
    /**
     * Crea un nuevo libro.
     * @param titulo Nombre del libro.
     **/
    public EjemplarLibro(String titulo) {
        title = titulo;
        registryDate = LocalDate.now();
        issueNumber = 1;
        isBorrowed = false;
    }
    /**
     * Crea un nuevo ejemplar desde un libro ya existente.
     * @param book El libro original en cuestion.
     **/
    public EjemplarLibro(EjemplarLibro book) {
        title = book.title;
        registryDate = book.registryDate;
        issueNumber = book.issueNumber++;
        isBorrowed = false;
    }
    /**
     * Presta el libro.
     * @return Devuelve ```true``` si ha sido posible prestar el libro, ```false``` de lo contrario.
     **/
    public boolean Prestrar() {
        if (!isBorrowed) {
            isBorrowed = true;
            return true;
        } else return false;
    }
    /**
     * Devuelve el libro.
     * @return Devuelve ```true``` si se ha podido devolver el libro, ```false``` de lo contrario.
     **/
    public boolean Devolver() {
        if (isBorrowed) {
            isBorrowed = false;
            return true;
        } else return false;
    }
    /**
     * Devuelve el nombre del libro.
     * @return Un ```String``` que contiene el nombre del libro.
     **/
    @Override
    public String toString() {
        return title + " (Alta el " + registryDate.toString() + ") (Ejemplar n." + issueNumber + ")";
    }
}
