package BicicletasExoticas.producto;

/**
 *
 * @author AndresMauricio
 */
public class Exotica {
    private String soporte;
    private String asiento;
    private String estilo;

    public String getEspaldar() {
        return soporte;
    }

    public void setEspaldar(String soporte) {
        this.soporte = soporte;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getPatas() {
        return estilo;
    }

    public void setPatas(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Silla con "+"espaldar " + soporte.toLowerCase() + ", asiento " + asiento.toLowerCase() + " y estilo "+ estilo.toLowerCase();
    }
    
}
