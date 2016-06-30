package Alquilar.fabrica;
import Alquilar.producto.Rin.Rin26;
import Alquilar.producto.Estilo.Duplex;
import Alquilar.producto.color.Blanco;
/**
 *
 * @author AndresMauricio
 */
public class FabBicicletaParejas extends FabricaAbstracta {

    public FabBicicletaParejas() {
      
        this.crearColor();
        this.crearRin();
        this.crearEstilo();
    }

    @Override
    public void crearColor() {
        setColor(new Blanco());
    }

    @Override
    public void crearRin() {
        setRin(new Rin26());
    }

    @Override
    public void crearEstilo() {
        setEstilo(new Duplex());
    }

}
