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
public class ListaRepuestosCache implements ObtenerListaRepuestos{

    private ArrayList<Repuesto> listaRepuestos;
    
    @Override
    public ArrayList<Repuesto> consultarListaRepuestos() {
        cargarListaRepuestos();
        return listaRepuestos;
    }
    private void cargarListaRepuestos(){
        listaRepuestos = new ArrayList<>();
        listaRepuestos.add( new Repuesto(1, "Neumatico", 25) );
        listaRepuestos.add( new Repuesto(2, "Rin", 20) );
        listaRepuestos.add( new Repuesto(3, "Niple", 5) );
        listaRepuestos.add( new Repuesto(4, "Radio", 5) );
        listaRepuestos.add( new Repuesto(5, "Manubrio", 18) );
        listaRepuestos.add( new Repuesto(6, "Tensor", 13) );
        listaRepuestos.add( new Repuesto(7, "Descarrilador", 12) );
        listaRepuestos.add( new Repuesto(8, "Guaya", 7) );
        listaRepuestos.add( new Repuesto(9, "Sillin", 24) );
        listaRepuestos.add( new Repuesto(10, "Marco", 170) );
    }

    
}
