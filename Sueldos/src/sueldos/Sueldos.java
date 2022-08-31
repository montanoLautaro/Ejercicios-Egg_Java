package sueldos;

import Entidades.Vendedor;
import Servicios.VendedorServicios;


public class Sueldos {

    public static void main(String[] args) {
        VendedorServicios vs = new VendedorServicios();
        Vendedor v1 = new Vendedor();
        
        vs.SueldoMensual(v1);
        vs.vacaciones(v1);
    }
    
}
