/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaPersonalizada.Abstraccion;

import Comprar.BicicletaPersonalizada.avance.AvanceBici;
import Comprar.BicicletaPersonalizada.rin.RinBici;

/**
 *
 * @author Andres
 */
public class Playera extends Bicicleta {

    public Playera(AvanceBici avance, RinBici rin) {
        super(avance, rin);
    }

    private void pasear(){
        String mensaje = "PASEAR";
        getAvance().avanzar(mensaje);
        getRin().girar(mensaje);
    }
    @Override
    public void avanza() {
        pasear();
    }
    
}
