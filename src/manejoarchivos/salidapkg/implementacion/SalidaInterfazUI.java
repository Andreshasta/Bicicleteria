/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos.salidapkg.implementacion;

import manejoarchivos.salidapkg.especificacion.InterfaceSalida;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class SalidaInterfazUI implements InterfaceSalida{
    
    public SalidaInterfazUI(){
    }

    @Override
    public void salida(String dato) {
        JOptionPane.showMessageDialog(null, dato);
    }
}
