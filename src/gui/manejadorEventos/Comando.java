/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.manejadorEventos;

import gui.Principal;
import java.awt.event.ActionListener;

/**
 *
 * @author Edwin
 */
public interface Comando extends ActionListener{
    public void ejecutar(Principal ventana);
}
