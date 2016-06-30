/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.TipoMantenimiento.ClientePasajero;

import Mantenimiento.TipoMantenimiento.Entrada.Lectura;
import Mantenimiento.TipoMantenimiento.Entrada.ValorBicicleta;
import Mantenimiento.TipoMantenimiento.Manejador.Taller;

/**
 *
 * @author Andres
 */
public class ClienteGarantia {

    public void gestionarSolicitud(){
        Lectura entrada = new Lectura();
        ValorBicicleta valor = ValorBicicleta.getInstancia();
        valor.setValor(entrada.ingresarValor());

        Taller pasaje = new Taller();
        pasaje.categoriaTiquet(entrada.ingresarEntrada());
        
        
    }

}
