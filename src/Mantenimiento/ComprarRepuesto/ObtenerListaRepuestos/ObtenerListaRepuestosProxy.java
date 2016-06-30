/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos;

import Mantenimiento.ComprarRepuesto.ConsultorRepuestos.Repuesto;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ObtenerListaRepuestosProxy implements ObtenerListaRepuestos {

    ObtenerListaRepuestos proveedor;
    ArrayList<Repuesto> lista;

    @Override
    public ArrayList<Repuesto> consultarListaRepuestos() {
        proveedor = new ListaRepuestosProveedor();
        try {
            lista = proveedor.consultarListaRepuestos();
            System.out.println("proxy tam list "+lista.size());
        } catch (Exception e) {
            lista = null;
        }

        if (lista == null || lista.isEmpty()) {
            proveedor = new ListaRepuestosCache();
            lista = proveedor.consultarListaRepuestos();
        }
        return lista;
    }

}
