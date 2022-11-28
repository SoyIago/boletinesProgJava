package B4_ClasesObjetos;

public class Circulo {
    private double radius;
    
    public Circulo() {}
    
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    public double getRadius() {
        return radius;
    }
    
    public double calcularCircunferencia() {
        return 2 * radius * Math.PI;
    }
    
    public double calcularSuperficie() {
        return Math.PI * radius * radius;
    }
    
    public double calcularDiametro() {
        return radius * 2;
    }
}




