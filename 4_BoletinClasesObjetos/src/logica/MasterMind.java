package B4_ClasesObjetos.logica;

public class MasterMind {
    
    private final StringBuilder COMBINACION = new StringBuilder();
    private final StringBuilder DIGITOS = new StringBuilder("1234567890");
    private int aciertos;
    
    /**
     * Crea una nueva instancia de `MasterMind`.
     * @param tamano El tamano de la combinacion a adivinar.
     **/
    public MasterMind(int tamano) {
        final StringBuilder genCombinacion = new StringBuilder(DIGITOS);
        while (COMBINACION.length() != tamano) {
            int RNG = (int) (Math.random() * genCombinacion.length());
            COMBINACION.append(genCombinacion.charAt(RNG));
            genCombinacion.deleteCharAt(RNG);
        }
    }
    
    /**
     * Devuelve una linea con la informacion de una coincidencia COMPLETA.
     * @param pos La posicion del caracter donde se encontro la coincidencia.
     * @param caracter El caracter en cuestion que es coincidente.
     * @return Un `String` con la informacion de la coincidencia.
     **/
    private String coincidencia(int pos, String caracter) {
        return "Caracter '" + caracter + "' coincide en la posicion " + pos + ".\n";
    }
    
    /**
     * Devuelve una linea con la informacion de una coincidencia PARCIAL.
     * @param caracter El caracter en cuestion.
     * @return Un `String` con la informacion de la coincidencia.
     **/
    private String coincidenciaParcial(String caracter) {
        return "Caracter '" + caracter + "' esta presente.\n";
    }
    
    /**
     * Comprueba una determinada entrada de datos contra de la combicacion generada aleatoriamente, marcara tambien como ganada la partida de dar con la combinacion correcta.
     * @param input La entrada de datos a comprobar.
     * @return Devuelve un `String` que contiene toda la informacion sobre las coincidencias encontradas.
     **/
    public String comprobar(String input) {
        final String INVALIDO = "INVALIDO.\n";

        // Restablecemos los aciertos a 0.
        aciertos = 0;

        // Comprobacion de la entrada;
        // Si la entrada no tiene el tamano de la combinacion se descarta.
        
        if (input.length() != COMBINACION.length()) return INVALIDO;
       
        // Se comprueba que no haya digitos repetidos.
        
        final StringBuilder DIGITOSENTRADA = new StringBuilder(input.length());
        DIGITOSENTRADA.append(input);
        
        // Que cada digito que este presente en DIGITOS no este presente en
        // DIGITOSENTRADA mas de una vez: ultima aparicion del caracter en
        // la posicion `i` == `i`.
        
        for (int i = 0; i < DIGITOSENTRADA.capacity(); i++) {
            if (DIGITOS.indexOf("" + DIGITOSENTRADA.charAt(i)) != -1
                    && DIGITOSENTRADA.lastIndexOf("" + DIGITOSENTRADA.charAt(i)) == i + 1)
                return INVALIDO;
        }
        //
        
        StringBuilder returnInfo = new StringBuilder();
        
        // Comprobacion de coincidencias:
        //
        //  - Si el `caracter de entrada i` == `combinacion i` se marca como
        //    acierto y se informara al usuario.
        //  - Si no, se comprueba si el `caracter de entrada i` esta presente,
        //    si es asi se le informara al usuario.
        
        for (int i = 0; i < COMBINACION.length(); i++) {
            final String targetChar = DIGITOSENTRADA.substring(i, i + 1);
            if (DIGITOSENTRADA.charAt(i) == COMBINACION.charAt(i)) {
                returnInfo.append(coincidencia(i + 1, targetChar));
                aciertos++;
            } else if (DIGITOSENTRADA.lastIndexOf(targetChar) > -1) {
                returnInfo.append(coincidenciaParcial(targetChar));
            }
        }
        return returnInfo.toString();
    }
    
    /**
     * Comprueba si se acerto la combinacion.
     * @return Devuelve `true` si se ha acertado la combinacion generada por la maquina, `false` de lo contrario.
     **/
    public boolean partidaGanada() {
        return aciertos == COMBINACION.length();
    }
}
