/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaPersonalizada.ClienteP;

import Comprar.BicicletaPersonalizada.avance.*;
import Comprar.BicicletaPersonalizada.Abstraccion.*;
import Comprar.BicicletaPersonalizada.rin.*;

/**
 *
 * @author Andres
 */
public class Cliente {
    public static void main(String[] args) {
        Bicicleta bici;
        bici = new Urbana(new AvanceElectrico(), new RinCarrera());
        bici.avanza();
        bici = new Playera(new AvanceGasolina(), new RinUrbano());
        bici.avanza();
        bici = new Competencia(new AvanceMecanico(), new RinCarrera());
        bici.avanza();
        bici = new Competencia(new AvanceElectrico(), new RinUrbano());
        bici.avanza();
    }
}
