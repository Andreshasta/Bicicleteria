package Mantenimiento.ComprarRepuesto.ConsultorRepuestos;


import Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos.ListaRepuestosCache;
import Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos.ObtenerListaRepuestosProxy;
import Mantenimiento.ComprarRepuesto.lectura.LeerConsola;
import Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos.ObtenerListaRepuestos;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ConsultorListaRepuestos {
    
    public ArrayList<Repuesto> obtenerListaRepuesto(){
        ArrayList<Repuesto> listaRepuestos = null;
        ObtenerListaRepuestos proveedor = new ObtenerListaRepuestosProxy();
        listaRepuestos = proveedor.consultarListaRepuestos();
        for (Repuesto r : listaRepuestos) {
            System.out.print("id: "+r.getId());
            System.out.print(" Nombre: "+r.getNombre());
            System.out.print(" Valor: "+r.getPrecio());
            System.out.println();
        }
        return listaRepuestos;
    }
    
}
