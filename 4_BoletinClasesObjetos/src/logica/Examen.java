package B4_ClasesObjetos.logica;

public class Examen {
    
    private int numeroPreguntas;
    private final StringBuilder respuestasCorrectas = new StringBuilder(numeroPreguntas);
    private final StringBuilder respuestasAlumno = new StringBuilder(numeroPreguntas);
    private final String validInputs = "ABCDZ";
    
    public Examen(String respuestas) {
        numeroPreguntas = respuestas.length();
        respuestasCorrectas.append(respuestas);
        for (int i = 0; i < respuestas.length(); i++) {
            respuestasAlumno.append("Z");
        }
    }
    
    public boolean registrarRespuestas(String respuestas) {
        if (respuestas.length() != respuestasCorrectas.capacity()) return false;
        
        for (int i = 0; i < respuestas.length(); i++) {
            // Fun fact: se podria hacer con RegEx.
            for (int j = 0; j < validInputs.length(); j++) {
                if ((j == validInputs.length()) && !(respuestas.toUpperCase().charAt(i) == validInputs.charAt(j))) return false;
            }
        }
        
        respuestasAlumno.replace(0, numeroPreguntas, respuestas);
        return true;
    }
    
    public float evaluar() {
        float _puntuacionPregunta = 10.0f / numeroPreguntas; // En 20 preguntas, cada una valdria 0.5pts.
        float _restoFalloPregunta = 0.4f * _puntuacionPregunta; // En 20 preguntas, cada una descontaria 0.2pts.
        
        int aciertos = 0;
        int fallos = 0;
        for (int i = 0; i < numeroPreguntas; i++) {
            char _respuestaAlumno = respuestasAlumno.charAt(i);
            if (_respuestaAlumno != 'Z') if (_respuestaAlumno == respuestasCorrectas.charAt(i)) aciertos++;
            else fallos++;
        }
        
        float _nota = 0.50f * aciertos - (fallos * _restoFalloPregunta);
        if (_nota > 0) return _nota;
        else return 0;
    }
}
