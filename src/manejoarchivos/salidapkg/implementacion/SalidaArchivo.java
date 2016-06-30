package manejoarchivos.salidapkg.implementacion;

import manejoarchivos.salidapkg.especificacion.InterfaceSalida;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author AndresMauricio
 */
public class SalidaArchivo implements InterfaceSalida {

    @Override
    public void salida(String dato) {
        PrintWriter writer;
        try {
            writer = new PrintWriter("registro.txt", "UTF-8");
            writer.println(dato);
            writer.close();
        } catch (FileNotFoundException ex) {
            System.out.println("No encontro archivo");
        } catch (UnsupportedEncodingException ex) {
            System.out.println("No soporta la codificacion");
        }
    }
}
