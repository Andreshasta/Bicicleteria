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
public class ConstructorBiciRock extends AbstractBiciExoticaBuilder{
    private Exotica producto;

    public ConstructorBiciRock() {
        producto = new Exotica();
    }
    
    @Override
    public void construirLlantas() {
        producto.setEspaldar("Con tacos");
    }

    @Override
    public void construirAsiento() {
        producto.setAsiento("Metalico");
    }

    @Override
    public void contruirEstilo() {
        producto.setPatas("Dark");
    }

    @Override
    public Exotica obtenerBici() {
        return producto;
    }
    
}
