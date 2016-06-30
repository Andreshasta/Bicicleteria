package Alquilar.fabrica;

import Alquilar.producto.Rin.Rin24;
import Alquilar.producto.Estilo.Playera;
import Alquilar.producto.color.Azul;

/**
 *
 * @author AndresMauricio
 */
public class FabBicicletaCiudad extends FabricaAbstracta {

    public FabBicicletaCiudad() {
        this.crearColor();
        this.crearRin();
        this.crearEstilo();
    }

    @Override
    public void crearColor() {
        setColor(new Azul());
    }

    @Override
    public void crearRin() {
        setRin(new Rin24());
    }

    @Override
    public void crearEstilo() {
        setEstilo(new Playera());
    }

}
