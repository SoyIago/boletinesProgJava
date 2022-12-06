package B4_ClasesObjetos;
import B4_ClasesObjetos.logica.Alumno;

public class ejercicio12 {

    public static void main(String[] args) {
        /*
        Declaracion de los alumnos, alumno 2 y 3, contienen datos identicos sin ser uno una instancia puntero 
        al otro, significando esto que ```if (alumno2 == alumno3)``` es ```false```.
        */
        Alumno alumno1 = new Alumno("Amaranto Rivera Zayas", "25847823D", "1998-04-09");
        Alumno alumno2 = new Alumno("Santino Saucedo Montanez", "45127896X", "1999-09-04");
        Alumno alumno3 = new Alumno("Santino Saucedo Montanez", "45127896X", "1999-09-04");
        
        // Imprimir alumno1
        System.out.format("Alumno %s:\nDNI %s --- Fecha de nacimiento: %s\n\n", alumno1.getNombre(), alumno1.getDNI(), alumno1.getStgFNacimiento());
        // Modificar alumno1
        alumno1.setCentroEstudios("IES Urbano Lugris");
        if (!alumno1.setDNI("34908712W")) System.out.format("No se pudo cambiar el DNI de %s.\n\n", alumno1.getNombre());
        alumno1.setFNacimiento("2003-07-14");
        alumno1.setNombre("Honorata Lomeli Curiel");
        // Imprimir alumno1 despues de las modificaciones
        System.out.format("Alumno %s:\nDNI %s --- Fecha de nacimiento: %s\n\n", alumno1.getNombre(), alumno1.getDNI(), alumno1.getStgFNacimiento());
        // Imprimir alumno2 y alumno3
        System.out.format("Alumno %s:\nDNI %s --- Fecha de nacimiento: %s\n\n", alumno2.getNombre(), alumno2.getDNI(), alumno2.getStgFNacimiento());
        System.out.format("Alumno %s:\nDNI %s --- Fecha de nacimiento: %s\n\n", alumno3.getNombre(), alumno3.getDNI(), alumno3.getStgFNacimiento());
        // Comprobar si el alumno1 es mas joven que el alumno2
        if (Alumno.masJoven(alumno1, alumno2)) System.out.format("%s (%s) es mas joven que %s (%s)\n\n", alumno1.getNombre(), alumno1.getStgFNacimiento(), alumno2.getNombre(), alumno2.getStgFNacimiento());
        else System.out.format("%s es mas joven que", alumno2.getNombre(), alumno1.getNombre());
        // Comprobar si alumno1 es un duplicado de alumno2
        if (Alumno.esUnDuplicado(alumno1, alumno2)) System.out.format("%s esta duplicado.\n\n", alumno1.getNombre());
        // Comprobar si alumno2 es un duplicado de alumno3
        if (Alumno.esUnDuplicado(alumno2, alumno3)) System.out.format("%s esta duplicado.\n\n", alumno2.getNombre());
    }
    
}
