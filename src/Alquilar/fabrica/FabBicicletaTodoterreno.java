package Alquilar.fabrica;
import Alquilar.producto.Rin.Rin20;
import Alquilar.producto.Estilo.Todoterreno;
import Alquilar.producto.color.Rojo;

/**
 *
 * @author AndresMauricio
 */
public class FabBicicletaTodoterreno extends FabricaAbstracta{

    public FabBicicletaTodoterreno() {

        this.crearColor();
        this.crearRin();
        this.crearEstilo();
    }

    @Override
    public void crearColor() {
        setColor(new Rojo());
    }

    @Override
    public void crearRin() {
        setRin(new Rin20());
    }

    @Override
    public void crearEstilo() {
        setEstilo(new Todoterreno());
    }
    
}
