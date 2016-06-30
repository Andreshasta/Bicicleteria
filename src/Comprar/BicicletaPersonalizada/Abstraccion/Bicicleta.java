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
 * @author AndresMauricio
 */
public abstract class Bicicleta {

    private AvanceBici avance;
    private RinBici rin;

    public Bicicleta(AvanceBici avance, RinBici rin) {
        this.avance = avance;
        this.rin = rin;
    }

    public AvanceBici getAvance() {
        return avance;
    }

    public RinBici getRin() {
        return rin;
    }
    
    public abstract void avanza();

}
