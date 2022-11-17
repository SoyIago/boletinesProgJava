package boletinBucles;
import java.util.Scanner;

public class ejercicio24 {

    public static void main(String[] args) {
        int _nOfWorkers = 30, fNOfWorkers = 0;
        char[] workersGender = new char[_nOfWorkers];
        int[] workersAge = new int[_nOfWorkers];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < _nOfWorkers; i++) {
            System.out.println("Trabajador " + i);
            
            String keyboardInput;
            boolean _stop = false;
            
            do {
                System.out.print("Edad: ");
                keyboardInput = keyboard.nextLine();
                
                if (keyboardInput.matches("[0-9]{1,2}"))
                    workersAge[i] = Integer.parseInt(keyboardInput);
                else workersAge[i] = -18;
                
                if (workersAge[i] == 0) {
                    _stop = true;
                    break;
                }
            } while (workersAge[i] > 71 || workersAge[i] < 15) ; 
            
            if (_stop) break;
            else fNOfWorkers++;
            
            do {
                System.out.print("Genero: ");
                keyboardInput = keyboard.nextLine();
                workersGender[i] = keyboardInput.toUpperCase().charAt(0);
            } while (!keyboardInput.matches("[mfMF]"));
            
        }
        
        boolean any60plus = false;
        int ageWomen = 0, countWomen = 0, ageYoungest = 100;
        char genderYoungest = 'F';
        
        for (int i = 0; i < fNOfWorkers; i++) {
            if (workersAge[i] > 60 && !any60plus) any60plus = true;
            if (workersAge[i] < ageYoungest) {
                ageYoungest = workersAge[i];
                genderYoungest = workersGender[i];
            }
            if (workersGender[i] == 'F') {
                ageWomen += workersAge[i];
                countWomen++;
            }
        }
        
        System.out.print("Hay " + fNOfWorkers + "trabajadores, de los cuales " + countWomen + 
                "son mujeres, que tienen una edad media de " + (ageWomen / countWomen) +
                " el trabajador más joven es ");
        if (genderYoungest == 'F') System.out.print("una mujer de ");
        else System.out.print("un hombre de");
        
        System.out.println(ageYoungest + " a?os.");
        
        if (any60plus) System.out.println("Hay algun trabajador de más de 60 a?os.");
    }
    
}
