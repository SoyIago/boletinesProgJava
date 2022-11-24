package B3_Funciones;

public class ejercicio4 {

    public static void main(String[] args) {
        System.out.println(daysSinceGivenDate(2001, (byte) 9, (byte) 1, (byte) 12, (byte) 31));
    }
    
    private static byte CalcularDiasMes(int year, byte month) {
        byte totalDays = 30;
        
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> totalDays++;
            case 2 -> totalDays -= 2;
        }
        
        if (month == 2) if (year % 4 == 0 && year % 100 != 0) totalDays++;
        
        return totalDays;
    }
    
    private static int daysSinceStJan(int year, byte month, byte day) {
    
        int days = day;
        for (byte i = month; i > 1; i--) {
            days += CalcularDiasMes(year, i);
        }
        
        return days;
    }
    
    private static int daysSinceGivenDate (int year, byte stMonth, byte stDay, byte ndMonth, byte ndDay) {
        int stDays = daysSinceStJan(year, stMonth, stDay);
        int ndDays = daysSinceStJan(year, ndMonth, ndDay);
        
        return ndDays - stDays;
    }
    
}
