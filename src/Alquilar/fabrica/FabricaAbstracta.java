package Alquilar.fabrica;
import Alquilar.producto.Rin.Rin;
import Alquilar.producto.Estilo.Estilo;
import Alquilar.producto.color.Color;
/**
 *
 * @author AndresMauricio
 */
public abstract class FabricaAbstracta {

    
    private Color color;
    private Rin rin;
    private Estilo estilo;

    public abstract void crearColor();

    public abstract void crearRin();

    public abstract void crearEstilo();

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Rin getRin() {
        return rin;
    }

    public void setRin(Rin rin) {
        this.rin = rin;
    }

    public Estilo getEstilo() {
        return estilo;
    }

    public void setEstilo(Estilo estilo) {
        this.estilo = estilo;
    }
}
