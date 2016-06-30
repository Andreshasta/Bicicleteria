/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos.entradapkg.implementacion;

import manejoarchivos.entradapkg.especificacion.InterfaceEntrada;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class LeerInterfaz implements InterfaceEntrada {

    @Override
    public String leer() {
        String entrada;
        entrada = JOptionPane.showInputDialog("Por favor ingrese texto: ");
        return entrada;
    }

}
