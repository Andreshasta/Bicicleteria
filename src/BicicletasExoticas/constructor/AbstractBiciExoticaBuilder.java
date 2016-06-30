package BicicletasExoticas.constructor;

import BicicletasExoticas.producto.Exotica;

/**
 *
 * @author AndresMauricio
 */
public abstract class AbstractBiciExoticaBuilder {
    public abstract void construirLlantas();
    public abstract void construirAsiento();
    public abstract void contruirEstilo();
    public abstract Exotica obtenerBici();
}
