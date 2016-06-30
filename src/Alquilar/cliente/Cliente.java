package Alquilar.cliente;
import Alquilar.fabrica.FabBicicletaCiudad;
import Alquilar.fabrica.FabBicicletaTodoterreno;
import Alquilar.fabrica.FabBicicletaParejas;
import Alquilar.fabrica.FabricaAbstracta;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author AndresMauricio
 */
public class Cliente {

    private static Cliente clienteActivo;
    private long idCliente;
    
    FabricaAbstracta fabrica;
    Bicicleta bicicleta;
    
    private Cliente(){
        idCliente=(new Date()).getTime();
    }
    public static Cliente obtenerInstancia(){
        if (clienteActivo == null ){
            clienteActivo = new Cliente();
        }
        return clienteActivo;
    }
    
    public void ingreso() {
        int opcion = 0;
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog(null, "Seleccione la bicicleta que desea: \n1. Duplex \n2. Todoterreno \n3. Playera \n4. Salir");
            try {
                if (entrada != null) {
                    opcion = Integer.parseInt(entrada);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "dato ingresado no valido.");
                opcion = 0;
            }
            if (opcion != 0) {
                procesarEntrada(opcion);
            }
        } while (opcion != 4 );
    }

    private void procesarEntrada(int entrada) {
        switch (entrada) {
            case 1:
                fabrica = new FabBicicletaParejas();
                obtenerBicicleta();
                mostrarBicicleta();
                break;
                
            case 2:
                fabrica = new FabBicicletaTodoterreno();
                obtenerBicicleta();
                mostrarBicicleta();
                break;
                
            case 3:
                fabrica = new FabBicicletaCiudad();
                obtenerBicicleta();
                mostrarBicicleta();
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "seleccion incorrecta");
        }
    }

    public void obtenerBicicleta() {
        bicicleta = new Bicicleta();
        bicicleta.setColor(fabrica.getColor());
        bicicleta.setRin(fabrica.getRin());
        bicicleta.setEstilo(fabrica.getEstilo());
      
    }

    public void mostrarBicicleta() {
        JOptionPane.showMessageDialog(null,  "Bicicleta para "
                + this.idCliente
                + "\nEstilo: "
                + bicicleta.getEstilo().getTipoEstilo()+ "\nColor: "
                + bicicleta.getColor().getTipoColor()+ "\nRin: "
                + bicicleta.getRin().getTamanoRin());
    }
}
