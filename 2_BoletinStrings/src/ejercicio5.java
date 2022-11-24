package B2_Strings;

public class ejercicio5 {

    public static void main(String[] args) {
        String charset = "abcdefghij";
        String usedCharset = "";
        
        System.out.println("Tu contrasena sera:");
        for (int i = (int) (Math.random() * 5 + 5); i > 0; i--) {
            int randomChar = (int) (Math.random() * charset.length());
            String _char = charset.charAt(randomChar) + "";
            
            if (usedCharset.contains(_char)) i++;
            else {
                System.out.print(_char);
                usedCharset += _char;
            }  
        }
        System.out.println();
    }
    
}
