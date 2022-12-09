package B4_ClasesObjetos.logica;
import java.time.LocalDate;
import java.time.LocalTime;

public class Tiempo {
    /**
     * Calcula los dias transcurridos entre dos fechas diferentes.
     * @param originDate Fecha desde la que empezar a contar, deberia ser la mas antigua.
     * @param finalDate Fecha hasta la que contar, deberia ser la mas reciente.
     * @return Devuelve un `long` con los dias en cuestion.
     **/
    public static long getDaysSince(LocalDate originDate, LocalDate finalDate) {
        return finalDate.toEpochDay() - originDate.toEpochDay();
    }
    /**
     * Calcula la fecha resultante tras haber transcurrido un determinado numero de dias
     * @param originDate Fecha de inicio.
     * @param days Dias a contar desde la fehca de inicio.
     * @return Devuelve un `LocalDate` correspondiente a la fecha en cuestion.
     **/
    public static LocalDate getDateAfter(LocalDate originDate, long days) {
        return LocalDate.ofEpochDay(originDate.toEpochDay() + days);
    }
    /**
     * Devuelve los segundos comprendidos entre dos horas diferentes.
     * @param originTime Hora de origen.
     * @param finalTime Hora de destino.
     * @return Devuelve un ```int``` con el valor de los segundos transcurridos entre las dos horas.
     **/
    public static int getClockTicks(LocalTime originTime, LocalTime finalTime) {
        if (finalTime.isAfter(originTime)) return finalTime.toSecondOfDay() - originTime.toSecondOfDay();
        else return originTime.toSecondOfDay() - finalTime.toSecondOfDay();
    }
    /**
     * Devuelve el conteo de anos bisiestos que ha habido entre los dos anos proporcionados.
     * @param originYear Un ```LocalDate``` con el ano de origen.
     * @param finalYear Un ```LocalDate``` con el ano de destino.
     * @return Un tipo ```int``` con el conteo de anos bisiestos.
     **/
    public static int leapYearsSince(LocalDate originYear, LocalDate finalYear) {
        int leapYearsCount = 0;
        LocalDate _currentYear, _finalYear;
        
        if (originYear.getYear() < finalYear.getYear()) {
            _currentYear = originYear;
            _finalYear = finalYear;
        }
        else {
            _currentYear = finalYear;
            _finalYear = originYear;
        }
        while (_finalYear.getYear() > _currentYear.getYear()) {
            if (_currentYear.isLeapYear()) {
                leapYearsCount++;
                // Trucardo para ahorrar CPU.
                _currentYear = _currentYear.plusYears(4);
            } else _currentYear = _currentYear.plusYears(1);
        }
        return leapYearsCount;
    }
    /**
     * Devuelve el nombre del dia que ocupa una determinada fecha.
     * @param givenDate Un tipo ```LocalDate``` que apunta a la fecha en cuestion.
     * @return Un tipo ```String``` con el nombre del dia en cuestion.
     **/
    public static String getDayName(LocalDate givenDate) {
        String _dayName = "Doomsday";
        switch (givenDate.getDayOfWeek().getValue()) {
            case 1 -> _dayName = "Luns";
            case 2 -> _dayName = "Martes";
            case 3 -> _dayName = "Mercores";
            case 4 -> _dayName = "Xoves";
            case 5 -> _dayName = "Venres";
            case 6 -> _dayName = "Sabado";
            case 7 -> _dayName = "Domingo";
        }
        return _dayName;
    }
    /**
     * Devuelve el conteo de dias que tiene en un ano un determinado dia de la semana.
     * @param targetDay El nombre del dia en cuestion (ej.: Lunes).
     * @param givenYear El ano en cuestion.
     * @return Devuelve un tipo ```int``` con el conteo del dia en cuestion, del ano proporcionado.
     **/
    public static int getNamedDaysOfYear(String targetDay, int givenYear) {
        LocalDate _currentDate = LocalDate.of(givenYear, 1, 1);
        int countOfGivenDay = 0;
        while (!_currentDate.equals(LocalDate.of(givenYear, 12, 31)))  {
            if (getDayName(_currentDate).toUpperCase().equals(targetDay.toUpperCase())) countOfGivenDay++;
            _currentDate = _currentDate.plusDays(1);
        }
        return countOfGivenDay;
    }
    /**
     * Devuelve el nombre de los dias correpondientes a los ultimos `X` 31 de Diciembre.
     * @param givenYears Conteo de anos a mirar.
     * @return Un ```String``` que lista el nombre de los `X` ultimos 31 de Diciembre, separados por comas.
     **/
    public static String getLastDayOfGivenYears(int givenYears) {
        LocalDate _finalDate = LocalDate.of(LocalDate.now().getYear(), 12, 31);
        LocalDate _currentDate = LocalDate.of(LocalDate.now().getYear() - givenYears, 12, 31);
        String _returnDays = "";
        while (!_finalDate.equals(_currentDate)) {
            _returnDays += getDayName(_currentDate) + ", ";
            _currentDate = _currentDate.plusYears(1);
        }
        return _returnDays.substring(0, _returnDays.length() - 2);
    }
}
