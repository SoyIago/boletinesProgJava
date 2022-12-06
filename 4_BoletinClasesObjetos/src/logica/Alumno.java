package B4_ClasesObjetos.logica;
import java.time.LocalDate;

public class Alumno {
    
    private String nombreA;
    private String documentoA;
    private LocalDate fNacimientoA;
    private String nombreEscuela;
    
    /**
     * Declara un nuevo alumno.
     * @param nombre Nombre y apellidos del alumno.
     * @param DNI Documento de identidad del alumno, los valores incorrectos escriben un DNI ficticio `FI[0-9]{7}`.
     * @param fechaNacimiento Fecha de nacimiento, un ```String``` en formato `YYYY-MM-DD`.
    **/
    public Alumno(String nombre, String DNI, String fechaNacimiento) {
        nombreA = nombre;
        if (checkDNI(DNI)) documentoA = DNI;
        else documentoA = "FI" + ((int) (Math.random() * 9999999));
        fNacimientoA = LocalDate.parse(fechaNacimiento);
        nombreEscuela = "IES Fernando Wirzt Suarez";
    }
    /**
     * Declara un nuevo alumno.
     * @param nombre Nombre y apellidos del alumno.
     * @param DNI Documento de identidad del alumno, los valores incorrectos escriben un DNI ficticio `FI[0-9]{7}`.
     * @param fechaNacimiento Un tipo ```LocalDate``` que contiene la fecha de nacimiento.
    **/
    public Alumno(String nombre, String DNI, LocalDate fechaNacimiento) {
        nombreA = nombre;
        if (checkDNI(DNI)) documentoA = DNI;
        else documentoA = "FI" + ((int) (Math.random() * 9999999));
        fNacimientoA = fechaNacimiento;
    }
    
    /**
     * Devuelve el nombre del alumno.
     * @return Un `String` con el nombre completo del alumno.
    **/
    public String getNombre() {
        return nombreA;
    }
    /**
     * Establece el nuevo nombre del alumno.
     * @param nombre Un ```String``` con el nuevo nombre del alumno.
    **/
    public void setNombre(String nombre) {
        nombreA = nombre;
    }
    /**
     * Devuelve el numero de documento de identidad del alumno.
     * @return Un ```String``` con el numero de documento en cuestion.
    **/
    public String getDNI() {
        return documentoA;
    }
    /**
     * Establece el nuevo numero de documento de identidad del alumno,
     * @param numeroDocumento Un ```String``` con el nuevo numero de documento.
     * @return Devuelve ```True``` si se pudo cambiar el numero de documento (si es un DNI valido).
    **/
    public boolean setDNI(String numeroDocumento) {
        if (checkDNI(numeroDocumento)) {
            documentoA = numeroDocumento;
            return true;
        } else return false;
    }
    /**
     * Cambia la fecha de nacimiento del alumno.
     * @param fechaNacimiento Nueva fecha de nacimiento, en formato `YYYY-MM-DD`.
    **/
    public void setFNacimiento(String fechaNacimiento) {
        fNacimientoA = LocalDate.parse(fechaNacimiento);
    }
    /**
     * Cambia la fecha de nacimiento del alumno.
     * @param fechaNacimiento Nueva fecha de nacimiento, como tipo `LocalDate`.
    **/
    public void setFNacimiento(LocalDate fechaNacimiento) {
        fNacimientoA = fechaNacimiento;
    }
    /**
     * Duvuelve la fecha de nacimineto del alumno.
     * @return Un tipo ```LocalDate``` que contiene la fecha de nacimiento del alumno.
    **/
    public LocalDate getFNacimiento() {
        return fNacimientoA;
    }
    /**
     * Duvuelve la fecha de nacimineto del alumno.
     * @return Un tipo ```String``` que contiene la fecha de nacimiento del alumno.
    **/
    public String getStgFNacimiento() {
        return fNacimientoA.toString();
    }
    /**
     * Devuelve el nombre del centro educativo.
     * @return Un ```String``` con el nombre del centro educativo.
    **/
    public String getCentroEstudios() {
        return nombreEscuela;
    }
    /**
     * Cambia el nombre del centro de estudios asociado al alumno.
     * @param nombreCEstudios Un ```String``` con el nombre del nuevo centro educativo.
    **/
    public void setCentroEstudios(String nombreCEstudios) {
        nombreEscuela = nombreCEstudios;
    }
    /**
     * Comprueba que el alumno tenga 18 anos: suma 18 anos a su fecha de nacimiento y la compara contra esta misma.
     * @return Devuelve ```True``` si han pasado 18 anos o ```False``` si todavia no han pasado 18 anos.
     **/
    public boolean mayorDeEdad() {
        return fNacimientoA.isAfter(fNacimientoA.plusYears(18));
    }
    /**
     * Comprueba si el alumno es mas joven que el `alumno2` proporcionado comparando las fechas de nacimiento de ambos.
     * @param alumno1 Alumno, en teoria, el mas joven.
     * @param alumno2 El otro alumno contra el que hacer la comprobacion.
     * @return Devuelve ```True``` si la fecha de nacimiento es posterior a la fecha de nacimiento del `alumno2`, ```False``` si ocurre lo contrario.
    **/
    public static boolean masJoven(Alumno alumno1, Alumno alumno2) {
        return alumno1.fNacimientoA.isAfter(alumno2.fNacimientoA);
    }
    
    /**
     * Comprueba si los valores de ambos alumnos son identicos.
     * @param alumno1 Un alumno cualquiera.
     * @param alumno2 Otro alumno cualquiera.
     * @return Devuelve `True` si los valores de ambos identicos, `False` si ocurre lo contrario.
    **/
    public static boolean esUnDuplicado(Alumno alumno1, Alumno alumno2) {
        return (alumno1.nombreA.equals(alumno2.nombreA) && alumno1.documentoA.equals(alumno2.documentoA));// && alumno1.fNacimientoA.isEqual(alumno2.fNacimientoA);
    }
    
    /**
     * Comprueba si el DNI suministrado cuerda con lo esperado a un numero de este tipo de documento y si este pasa la suma de verificacion `MOD23`.
     * @param DNI Un numero de DNI junto a su suma de verificacion `[0-9]{8}[A-Z^U^V]`.
     * @return Devuelve ```True``` si el DNI tiene un formato valido y ha pasado la prueba `MOD23`, ```False``` si ocurre lo contrario.
    */
    private boolean checkDNI(String DNI) {
        final String checkSums = "TRWAGMYFPDXBNJZSQVHLCKE";
        final String numbers = "0123456789";
        String verifiedDigits = "";
        
        // El DNI debe tener una longitud de 9 caracteres.
        if (DNI.length() != 9) return false;
        /*
            Recorrer toda la cadena del DNI (i), y comprararla contra toda la cadena
            de numeros (j), al conseguir i == j marcar como digitido verificado y parar.
        
            Fun fact: podria haberse hecho con RegEx, pero no me dejan.
        */
        for (int i = 0; i < DNI.length(); i++) {
            char _currentDigit = DNI.charAt(i);
            for (int j = 0; j < numbers.length(); j++) {
                if (_currentDigit == numbers.charAt(j)) {
                    verifiedDigits += _currentDigit;
                    break;
                }
            }
        }
        // Han de verificarse que los primeros ocho digitos sean numeros.
        if (verifiedDigits.length() != 8) return false;
        // El MOD23 de los numeros verificados ha de coincidir con su letra en cuestion.
        return DNI.toUpperCase().charAt(8) == checkSums.charAt(Integer.parseInt(verifiedDigits) % 23);
    }
}
