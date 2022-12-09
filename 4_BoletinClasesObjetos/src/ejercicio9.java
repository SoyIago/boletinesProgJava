package B4_ClasesObjetos;
import B4_ClasesObjetos.logica.Tiempo;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

public class ejercicio9 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // ---------------------------------------------------------------------
        System.out.print("\nI. Introducir tu fecha de nacimiento y muestre cuantos días han pasado hasta ahora mismo.\n\n");
        //
        System.out.print("Introduce tu fecha de nacimiento (YYYY-MM-DD): ");
        System.out.format("%d dias trascurridos desde tu nacimiento.\n", 
                Tiempo.getDaysSince(LocalDate.parse(keyboard.nextLine()), LocalDate.now()));
        
        // ---------------------------------------------------------------------
        System.out.print("\nII. Introducir una fecha y un número de días y calcule la fecha que se obtiene al incrementar dichos días a la fecha.\n\n");
        // ---------------------------------------------------------------------
        System.out.print("Dame una fecha (YYYY-MM-DD): ");
        LocalDate _dateInput = LocalDate.parse(keyboard.nextLine());
        System.out.print("Dias a adelantar: ");
        long _daysPassed = Long.parseLong(keyboard.nextLine());
        System.out.format("Cuadraria en el %s.\n\n",
                Tiempo.getDateAfter(_dateInput, _daysPassed).toString());
        
        // ---------------------------------------------------------------------
        System.out.print("\nIII. Introducir dos horas de reloj y nos dé la diferencia entre ambas en segundos.\n\n");
        // ---------------------------------------------------------------------
        System.out.print("Dame una hora (HH:MM(:SS)): ");
        LocalTime stHour = LocalTime.parse(keyboard.nextLine());
        System.out.print("Dame otra hora (HH:MM(:SS)): ");
        LocalTime ndHour = LocalTime.parse(keyboard.nextLine());
        System.out.format("Desde las %s hasta las %s han pasado %s segundos.\n", stHour.toString(), ndHour.toString(), Tiempo.getClockTicks(stHour, ndHour));
        
        // ---------------------------------------------------------------------
        System.out.print("\nIV. ¿Cuántos años bisiestos ha habido desde el año 1 dC?\n\n");
        // ---------------------------------------------------------------------
        System.out.format("Desde el ano 1 han habido %d anos bisiestos.\n", Tiempo.leapYearsSince(LocalDate.parse("0001-01-01"), LocalDate.now()));
        
        // ---------------------------------------------------------------------
        System.out.print("\nV. Introducir una fecha y mostrar el día de la semana que le corresponde.\n\n");
        // ---------------------------------------------------------------------
        System.out.print("Dame una fecha (YYYY-MM-DD): ");
        System.out.format("Cuadra en %s.\n", Tiempo.getDayName(LocalDate.parse(keyboard.nextLine())));
        
        // ---------------------------------------------------------------------
        System.out.print("\nVI. Introducir un tipo de producto (1- perecedero, 2-electrónica, 3-ropa) y la fecha de compra, y que informe si se puede devolver a día de hoy o no (los plazos de devolución, son respectivamente 5 horas, 6 meses, 15 días)\n\n");
        // ---------------------------------------------------------------------
        System.out.print("Dime el tipo de producto (1, 2 o 3): ");
        String producto = keyboard.nextLine();
        System.out.print("Dame la fecha de compra (YYYY-MM-DD): ");
        LocalDate fechaCompra = LocalDate.parse(keyboard.nextLine());
        if (producto.charAt(0) == '1') {
            if (fechaCompra.equals(LocalDate.now())) {
                System.out.print("\nDame la hora la de compra (HH:MM(:SS)): ");
                String inputHoraCompra = keyboard.nextLine();
                LocalTime horaCompra = LocalTime.parse(inputHoraCompra);
                if (Tiempo.getClockTicks(horaCompra, LocalTime.now()) > 18000) devolver(false);
                else devolver(true);
            } else devolver(false);
        }
        if (producto.charAt(0) == '2') {
            if (Tiempo.getDaysSince(fechaCompra, LocalDate.now()) < 180) devolver(true);
            else devolver(false);
        }
        if (producto.charAt(0) == '3') {
            if (Tiempo.getDaysSince(fechaCompra, LocalDate.now()) < 15) devolver(true);
            else devolver(false);
        }
        // ---------------------------------------------------------------------
        System.out.print("\n\nVII. Introducir un año y decir cuántos domingos tiene.\n");
        // ---------------------------------------------------------------------
        System.out.print("Dame un ano: ");
        int _givenYear = Integer.parseInt(keyboard.nextLine());
        if (LocalDate.of(_givenYear, 01, 01).isAfter(LocalDate.now()))
            System.out.format("El ano %d tiene %d Domingos.\n", _givenYear, Tiempo.getNamedDaysOfYear("Domingo", _givenYear));
        else
            System.out.format("El ano %d tuvo %d Domingos.\n", _givenYear, Tiempo.getNamedDaysOfYear("Domingo", _givenYear));
        // ---------------------------------------------------------------------
        System.out.print("\n\nVIII. Indica el día de la semana (en texto, en gallego) del 31 de diciembre de los últimos 5 años.\n");
        // ---------------------------------------------------------------------
        System.out.format("Los ultimos cinco anos (de menor a mayor) acabaron en %s.\n", Tiempo.getLastDayOfGivenYears(5));
    }
    /**
     * Imprime por pantalla si un producto se puede devolver o no.
     * @param doIt ```true``` si hay que informar de que la devolucion es posible, ```false``` de lo contrario.
     **/
    private static void devolver (boolean doIt) {
        if (doIt) System.out.print("Aun puedes devolver este producto.\n");
        else System.out.print("Ya no puedes devolver este producto.\n");
    }
    
}