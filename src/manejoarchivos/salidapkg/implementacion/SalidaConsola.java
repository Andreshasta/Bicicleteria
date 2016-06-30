/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos.salidapkg.implementacion;

import manejoarchivos.salidapkg.especificacion.InterfaceSalida;

/**
 *
 * @author AndresMauricio
 */
public class SalidaConsola implements InterfaceSalida {

    @Override
    public void salida(String dato) {
        System.out.println(dato);
    }
}
