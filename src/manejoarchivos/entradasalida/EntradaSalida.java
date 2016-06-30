package manejoarchivos.entradasalida;


/**
 *
 * @author AndresMauricio
 */
public class EntradaSalida {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        EntradaSalida.procesar();
    }*/
    public static void procesar(){
        String dato;
        Lee entra = new Lee();
        dato=entra.leerValor(2);
        Salida sale = new Salida();
        sale.setDato(dato);
        sale.salidaValor(2);
    }

}
