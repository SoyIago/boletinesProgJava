package B4_ClasesObjetos;

public class Circulo {
    private double radio;
    
    public Circulo() {}
    
    public void setRadio(double newRadius) {
        radio = newRadius;
    }
    public double getRadio() {
        return radio;
    }
    
    public double calcularCircunferencia() {
        return 2 * radio * Math.PI;
    }
    
    public double calcularSuperficie() {
        return Math.PI * radio * radio;
    }
    
    public double calcularDiametro() {
        return radio * 2;
    }
}




