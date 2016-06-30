/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.fabrica;

import Comprar.BicicletaArmada.producto.marco.GW;
import Comprar.BicicletaArmada.producto.enllantado.Kenda;
import Comprar.BicicletaArmada.producto.transmision.Shimano;

/**
 *
 * @author AndresMauricio
 */
public class FabBiciPlayera extends FabricaAbstracta{

    public FabBiciPlayera() {
        this.setTipo("Playera");
        this.crearMarco();
        this.crearLlantas();
        this.crearTransmision();
    }

    @Override
    public void crearMarco() {
        setMarco(new GW());
    }

    @Override
    public void crearLlantas() {
        setLlanta(new Kenda());
    }

    @Override
    public void crearTransmision() {
        setCambio(new Shimano());
    }
    
}
