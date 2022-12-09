package B4_ClasesObjetos;
import B4_ClasesObjetos.recursos.MovilPrepago;

public class ejercicio1 {

    public static void main(String[] args) {
        MovilPrepago telefono = new MovilPrepago(600400200l, 0.20f, 0.05f, 0.025f, 5.0f);
        System.out.format("Estadisticas para %d:\n\n", telefono.numeroMovil);
        
        int _duracionLlamada = 30;
        telefono.efectuarLlamada(_duracionLlamada);
        System.out.format("Has llamado %d:%d:%d minutos.\n", _duracionLlamada / 3600, _duracionLlamada / 60, _duracionLlamada % 60);
        System.out.format("Tu saldo actual son %fE.\n", telefono.consultarSaldo());
        
        int _mbGastados = 10;
        telefono.navegar(_mbGastados);
        System.out.format("Has gastado %dMB.\n", _mbGastados);
        System.out.format("Tu saldo actual son %fE.\n", telefono.consultarSaldo());
        
        int _recarga = 10;
        if (telefono.recargar(_recarga)) System.out.format("Has recargado %dE.\n", _recarga);
        System.out.format("Tu saldo actual son %fE.\n", telefono.consultarSaldo());
    }
    
}
