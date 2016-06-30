/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.manejadorEventos;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin
 */
public class AccionIngresar extends AbstractAction {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showInputDialog(null, "Prueba de ingreso", "prueba de ingreso", JOptionPane.ERROR_MESSAGE);
    }
    
}
