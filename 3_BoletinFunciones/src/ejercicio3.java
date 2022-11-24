package B3_Funciones;

public class ejercicio3 {

    public static void main(String[] args) {
        System.out.println(daysSinceStJan(2001, (byte) 12, (byte) 31));
    }
    
    private static byte getDaysOfMonth(int year, byte month) {
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
            days += getDaysOfMonth(year, i);
        }
        
        return days;
    }
    
}
