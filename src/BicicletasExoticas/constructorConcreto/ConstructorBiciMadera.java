/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicicletasExoticas.constructorConcreto;

import BicicletasExoticas.constructor.AbstractBiciExoticaBuilder;
import BicicletasExoticas.producto.Exotica;

/**
 *
 * @author AndresMauricio
 */
public class ConstructorBiciMadera extends AbstractBiciExoticaBuilder{

    private Exotica producto;

    public ConstructorBiciMadera() {
        producto = new Exotica();
    }
    
    @Override
    public void construirLlantas() {
        producto.setEspaldar("Pino");
    }

    @Override
    public void construirAsiento() {
        producto.setAsiento("Ondulado Cedro");
    }

    @Override
    public void contruirEstilo() {
        producto.setPatas("Renacentista");
    }

    @Override
    public Exotica obtenerBici() {
        return producto;
    }
    
}
