/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos;

import Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos.base.ConsultorBaseRepuestos;
import Mantenimiento.ComprarRepuesto.ConsultorRepuestos.Repuesto;
import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class ListaRepuestosProveedor implements ObtenerListaRepuestos {

    private ArrayList<Repuesto> listaRepuestos;
    
    @Override
    public ArrayList<Repuesto> consultarListaRepuestos() {
        ConsultorBaseRepuestos base = new ConsultorBaseRepuestos();
        listaRepuestos= base.leerArchivo();
        return listaRepuestos;
    }


}
