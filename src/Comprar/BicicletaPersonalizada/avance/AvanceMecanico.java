/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaPersonalizada.avance;

import Comprar.BicicletaPersonalizada.Abstraccion.Bicicleta;

/**
 *
 * @author Andres
 */
public class AvanceMecanico extends AvanceBici {

    public AvanceMecanico() {
        setTipoAvance("A PEDAL");
    }

    
    @Override
    public void avanzar(String objetivo) {
        System.out.println("Estoy avanzando con un motor "+getTipoAvance().toLowerCase()+" para "+objetivo.toLowerCase());
    }
}
