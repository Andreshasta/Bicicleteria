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
public class Urbana extends Bicicleta {

    public Urbana(AvanceBici avance, RinBici rin) {
        super(avance, rin);
    }

    private void trabajar(){
        String mensaje="TRABAJAR";
        getAvance().avanzar(mensaje);
        getRin().girar(mensaje);
    }
    @Override
    public void avanza() {
        trabajar();
    }

}
