package Alquilar.inicio;
import Alquilar.cliente.ClienteAlquilador;
/**
 *
 * @author AndresMauricio
 */
public class inicio {
    public static void main(String[] args) {
       ClienteAlquilador tienda = ClienteAlquilador.obtenerInstancia();
       tienda.ingreso();
       //Cliente tienda2 = Cliente.obtenerInstancia();
       //tienda2.ingreso();
    }
}
