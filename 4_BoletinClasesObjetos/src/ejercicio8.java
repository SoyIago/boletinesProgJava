package B4_ClasesObjetos;
import B4_ClasesObjetos.logica.EjemplarLibro;

public class ejercicio8 {

    public static void main(String[] args) {
        EjemplarLibro libro1 = new EjemplarLibro("Los Pilares de la Tierra");
        EjemplarLibro libro2 = new EjemplarLibro(libro1);
        
        EjemplarLibro libro3 = new EjemplarLibro("Un lugar llamado libertad");
        
        EjemplarLibro libro4 = new EjemplarLibro("Vuelo final");
        
        if (libro1.Prestrar()) System.out.format("%s prestado\n", libro1.toString());
        if (libro2.Prestrar()) System.out.format("%s prestado\n", libro2.toString());
        if (libro3.Prestrar()) System.out.format("%s prestado\n", libro3.toString());
        if (libro4.Prestrar()) System.out.format("%s prestado\n", libro4.toString());
        
        if (libro1.Devolver()) System.out.format("%s devuelto\n", libro1.toString());
        if (libro2.Devolver()) System.out.format("%s devuelto\n", libro2.toString());
        if (libro3.Devolver()) System.out.format("%s devuelto\n", libro3.toString());
        if (libro4.Devolver()) System.out.format("%s devuelto\n", libro4.toString());
    }
    
}
