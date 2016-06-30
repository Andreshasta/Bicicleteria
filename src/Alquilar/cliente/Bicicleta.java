package Alquilar.cliente;
import Alquilar.producto.Rin.Rin;
import Alquilar.producto.Estilo.Estilo;
import Alquilar.producto.color.Color;
/**
 *
 * @author AndresMauricio
 */
public class Bicicleta {

    private Color color;
    private Rin rin;
    private Estilo estilo;

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
