package B4_ClasesObjetos.logica;

public class Circulo {
    private double radio;
    /**
     * Declara un nuevo circulo.
     **/
    public Circulo() {}
    /**
     * Establece el radio del circulo
     * @param nuevoRadio Un tipo ```double``` con el valor del nuevo radio.
     **/
    public void setRadio(double nuevoRadio) {
        radio = nuevoRadio;
    }
    /**
     * Devuelve el radio del circulo.
     * @return Un tipo ```double``` con el valor del radio.
     **/
    public double getRadio() {
        return radio;
    }
    /**
     * Devuelve el valor de la circunferencia del circulo.
     * @return Un tipo ```double``` con el valor de la circunfernecia.
     **/
    public double calcularCircunferencia() {
        return 2 * radio * Math.PI;
    }
    /**
     * Devuelve el valor de la superficie del circulo.
     * @return Un tipo ```double``` con el valor de la superficie del circulo.
     **/
    public double calcularSuperficie() {
        return Math.PI * radio * radio;
    }
    /**
     * Devuelve el valor del diametro del circulo.
     * @return Un tipo ```double``` con el valor del diametro del circulo.
     **/
    public double calcularDiametro() {
        return radio * 2;
    }
}




