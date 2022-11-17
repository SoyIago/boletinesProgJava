package boletinFunciones;

public class ejercicio1 {

    public static void main(String[] args) {
        System.out.println(par(3));
        System.out.println(mayor(1d, 2d, 3d));
        System.out.println(sumaIntervalo(5, 13));
        System.out.println(contarCeros("06/06/2006"));
        System.out.println(aleatorio(10, 20));
    }
    
    private static boolean par(int number) {
        return number % 2 == 0;
    }
    
    private static double mayor(double stNum, double ndNum, double rdNum) {
        //double _currentMax = stNum;
        //if (ndNum > _currentMax) _currentMax = ndNum;
        //if (rdNum > _currentMax) _currentMax = rdNum;
        //return _currentMax;
        
        return Math.max(Math.max(stNum, ndNum), rdNum);
    }
    
    private static long sumaIntervalo(long stNum, long ndNum) {
        if (stNum > ndNum || stNum < 0 || ndNum < 0) return -1L;
        else {
            var acumulador = stNum;
            for (var i = stNum + 1; i <= ndNum; i++) acumulador += i;
            return acumulador;
        }
    }
    
    private static int contarCeros(String stgInput) {
        int acumulador = 0;
        for (int i = 0; i < stgInput.length(); i++) if (stgInput.charAt(i) == '0') acumulador++;
        return acumulador;
    }
    
    private static int aleatorio(int stNum, int ndNum) {
        if (stNum > ndNum || stNum < 0 || ndNum < 0) return -1;
        else return (int) (Math.random() * (ndNum - stNum)) + stNum;
    }
}
