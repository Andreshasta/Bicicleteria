/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.manejadorEventos;

import gui.Principal;
import gui.RegistroCliente;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin
 */
public class ComandoIngresar implements Comando {

    /*@Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Prueba de ingreso", "prueba de ingreso", JOptionPane.ERROR_MESSAGE);
    }*/

    @Override
    public void ejecutar(Principal ventana) {
        JOptionPane.showMessageDialog(ventana, "Prueba de ingreso", "prueba de ingreso", JOptionPane.ERROR_MESSAGE);
        
    }
    
}
