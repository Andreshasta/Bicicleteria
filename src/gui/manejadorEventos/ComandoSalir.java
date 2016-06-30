/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.manejadorEventos;

import gui.Principal;
import javax.swing.JFrame;

/**
 *
 * @author Edwin
 */
public class ComandoSalir implements Comando{

    @Override
    public void ejecutar(Principal ventana) {
        System.exit(0);
    }
    
}
