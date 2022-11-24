package B2_Strings;
import java.util.Scanner;

public class ejercicio12 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input;
        boolean invalidStg = false;
        
        do {
            System.out.print("Dame seis digitos diferentes: ");
            input = keyboard.nextLine();
            if (input.matches("\\d{6}")) {
                String bannedNumbers = "";
                
                for (int i = 0; i < input.length(); i++) {
                    boolean jHalt = false;
                    for (int j = 0; j < bannedNumbers.length(); j++) {
                        if (input.charAt(i) == bannedNumbers.charAt(j)) {
                            System.out.println("Cadena invalida.");
                            invalidStg = true; 
                            jHalt = true;
                            break;
                        }
                    }
                    if (jHalt) break; 
                    bannedNumbers += input.charAt(i);
                     
                }
            } else {
                    invalidStg = true; 
                    System.out.println("Cadena invalida.");
            }
        } while (invalidStg);
        
        System.out.println("Cadena valida.");
    }
    
}
