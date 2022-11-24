package B2_Strings;
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Dame un texto: ");
        String input = keyboard.nextLine();
        
        // A. Mostrar por pantalla el contenido de la cadena pasada a may�sculas y min�sculas.
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        
        // B. Decir si en la cadena aparece el car�cter ?x?. 
        if (input.contains("x")) System.out.println("La cadena contiene la leta 'x'");
        
        //C. Decir si la cadena tiene m�s de 10 posiciones. 
        if (input.length() > 10) System.out.println("La cadena tiene m�s de 10 posiciones.");
        
        //D. Decir si la cadena contiene el car�cter ?x? a partir de la cuarta posici�n. 
        if (input.substring(4).contains("x")) System.out.println("La letra x aparece a partir de la cuarta posici�n.");
        
        //E. Crear una cadena formada por las 5 primeras posiciones de la cadena.
        String _firstFiveInput = input.substring(0, 5);
        System.out.println(_firstFiveInput);
        
        //F. Crear una cadena formada por las 5 �ltimas posiciones de la cadena. 
        String _lastFiveInput = input.substring(input.length() - 5, input.length());
        System.out.println(_lastFiveInput);
        
        //G. Decir si la cadena es igual a la cadena ?hola?.
        if ("hola".equals(input)) System.out.println("La cadena es igual a 'hola'");
        
        //H. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
        //   es un n�mero, esto es, contiene solo d�gitos decimales (del 0 a 9).
        if (input.matches("[0-9]{1,}")) {
            int _input2int = Integer.parseInt(input);
            System.out.println("Cadena convertida a tipo 'int': " + _input2int);
        }
        
        //I. Convertir la cadena de entrada a una variable de tipo int, suponiendo que dicha cadena
        //   es un n�mero hexadecimal, esto es, contiene solo d�gitos decimales (del 0 a 9) y letras de
        //   la A a F.
        if (input.matches("[0-9a-fA-F]{1,7}")) {
            int _input2hexint = Integer.parseInt(input, 16);
            System.out.println("Cadena hexadecimal convertida a tipo 'int': " + _input2hexint);
        }
        
        //J. Si se encuentra con en su interior con ?prueva? sustituir por ?prueba?.
        if (input.contains("prueva")) {
            String _inputCorrected = input.replace("prueva", "prueba");
            System.out.println("Entrada corregida: " + _inputCorrected);
        }
        
        //K. . Decir si la primera posici�n de la cadena es igual a la �ltima. 
        if (input.endsWith(input.substring(0, 1)))
            System.out.println("La primera posici�n es igual a la ultima.");
        
        //L. Decir cu�ntos d�gitos num�ricos hay en la cadena. 
        int _numCount= 0;
        for (int i = 0; i < input.length() - 1; i++) {
            String CharAtIndex = "";
            CharAtIndex += input.charAt(i);
            if (CharAtIndex.matches("[0-9]")) _numCount++;
        }
        System.out.println("Hay " + _numCount + " n�meros en la cadena.");
        
        //M. Decir si la cadena es un pal�ndromo (se lee igual hacia adelante como hacia atr�s)
        String _reverseInput = "";
        for (int i = input.length() - 1; i >= 0 ; i--) _reverseInput += input.charAt(i);
        if (_reverseInput.equals(input)) System.out.println("La cadena es un palindromo.");
        
        //N. Crear una cadena que sea igual a la introducida, pero con la primera y �ltima posiciones intercambiadas
        String _flipStart2Finish = input.charAt(input.length() - 1) + 
                input.substring(1, (input.length() - 1)) + 
                input.charAt(0);
        System.out.println(_flipStart2Finish);
    }
    
}
