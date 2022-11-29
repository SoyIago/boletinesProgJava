package B4_ClasesObjetos;

public class ejercicio7 {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo();
        Circulo circulo3 = new Circulo();
        
        circulo1.setRadio(Math.random() * 25 + 25);
        circulo2.setRadio(Math.random() * 25 + 50);
        circulo3.setRadio(Math.random() * 25 + 75);
        
        System.out.format("Circulo 1: \n\tRadio: %fu\n\tDiametro: %fu\n\tCircunferencia: %fu\n\tSuperficie: %fu^2\n\n", 
                circulo1.getRadio(), 
                circulo1.calcularDiametro(), 
                circulo1.calcularCircunferencia(), 
                circulo1.calcularSuperficie());
        
        System.out.format("Circulo 2: \n\tRadio: %fu\n\tDiametro: %fu\n\tCircunferencia: %fu\n\tSuperficie: %fu^2\n\n", 
                circulo2.getRadio(), 
                circulo2.calcularDiametro(), 
                circulo2.calcularCircunferencia(), 
                circulo2.calcularSuperficie());
        
        System.out.format("Circulo 3: \n\tRadio: %fu\n\tDiametro: %fu\n\tCircunferencia: %fu\n\tSuperficie: %fu^2\n\n", 
                circulo3.getRadio(), 
                circulo3.calcularDiametro(), 
                circulo3.calcularCircunferencia(), 
                circulo3.calcularSuperficie());
    }
    
}
