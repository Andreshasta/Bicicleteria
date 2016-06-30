/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.fabrica;

import Comprar.BicicletaArmada.producto.marco.Cannondale;
import Comprar.BicicletaArmada.producto.enllantado.Michelin;
import Comprar.BicicletaArmada.producto.transmision.MegaRanger;

/**
 *
 * @author AndresMauricio
 */
public class FabBiciCross extends FabricaAbstracta {

    public FabBiciCross() {
        this.setTipo("Cross");
        this.crearMarco();
        this.crearLlantas();
        this.crearTransmision();
    }

    @Override
    public void crearMarco() {
        setMarco(new Cannondale());
    }

    @Override
    public void crearLlantas() {
        setLlanta(new Michelin());
    }

    @Override
    public void crearTransmision() {
        setCambio(new MegaRanger());
    }

}
