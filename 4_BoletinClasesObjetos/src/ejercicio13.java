import java.time.*;

public class ejercicio13 {
    public static void main(String[] args) {
        Contacto contacto;
        contacto = new Contacto ("Marta", 6661111222L, LocalDate.parse("2019-11-25"));
        contacto = new Contacto ("Miguel", 1111111L, LocalDate.now());
        contacto = new Contacto ("Ana", 3333333L, "2019-11-20");
        contacto = new Contacto ("Daniel", 444444L);
    }
}

class Contacto {
    public String nombre;
    public long numero;
    public LocalDate fechaAltaAgenda;

    Contacto (String no, long nu, LocalDate fe){
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = fe;
    }
    
    Contacto (String no, long nu, String fe) {
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = LocalDate.parse(fe);
    }
    
    Contacto (String no, long nu) {
        this.nombre = no;
        this.numero = nu;
        this.fechaAltaAgenda = LocalDate.now();
    }
}