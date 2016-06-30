package Alquilar.inicio;
import Alquilar.cliente.Cliente;
/**
 *
 * @author AndresMauricio
 */
public class inicio {
    public static void main(String[] args) {
       Cliente tienda = Cliente.obtenerInstancia();
       tienda.ingreso();
       //Cliente tienda2 = Cliente.obtenerInstancia();
       //tienda2.ingreso();
    }
}
