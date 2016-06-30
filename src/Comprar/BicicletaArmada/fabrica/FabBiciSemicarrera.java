/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.fabrica;

import Comprar.BicicletaArmada.producto.marco.Ballistic;
import Comprar.BicicletaArmada.producto.enllantado.GrandSport;
import Comprar.BicicletaArmada.producto.transmision.SuperLow;

/**
 *
 * @author AndresMauricio
 */
public class FabBiciSemicarrera extends FabricaAbstracta {

    public FabBiciSemicarrera() {
        this.setTipo("Semicarrera");
        this.crearMarco();
        this.crearLlantas();
        this.crearTransmision();
    }

    @Override
    public void crearMarco() {
        setMarco(new Ballistic());
    }

    @Override
    public void crearLlantas() {
        setLlanta(new GrandSport());
    }

    @Override
    public void crearTransmision() {
        setCambio(new SuperLow());
    }

}
