package botelinStrings;
        
public class ejercicio4 {

    public static void main(String[] args) {
        
        String charset = "abcdefghij";
        
        System.out.println("Tu contrasena sera:");
        for (int i = (int) (Math.random() * 5 + 5); i > 0; i--) {
            int randomChar = (int) (Math.random() * charset.length());
            System.out.print(charset.charAt(randomChar));
        }
        System.out.println();
        
    }
    
}
