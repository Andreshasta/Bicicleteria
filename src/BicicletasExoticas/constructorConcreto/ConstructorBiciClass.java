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
public class ConstructorBiciClass extends AbstractBiciExoticaBuilder {

    private Exotica producto;

    public ConstructorBiciClass() {
        producto = new Exotica();
    }
    

    @Override
    public void construirLlantas() {
        producto.setEspaldar("CaraBlanca");
    }

    @Override
    public void construirAsiento() {
        producto.setAsiento("Clasico");
    }

    @Override
    public void contruirEstilo() {
        producto.setPatas("ochentera");
    }

    @Override
    public Exotica obtenerBici() {
        return producto;
    }

}
