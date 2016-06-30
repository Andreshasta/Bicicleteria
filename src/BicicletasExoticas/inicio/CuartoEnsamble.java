package BicicletasExoticas.inicio;

import BicicletasExoticas.director.BiciDirector;
import java.util.Scanner;

/**
 *
 * @author AndresMauricio
 */
public class CuartoEnsamble {

    public static void main(String[] args) {
        BiciDirector sd = new BiciDirector();
        System.out.println("Digite el tipo de sillaBicicleta que desea: ");
        System.out.println("1- Bicicleta Class");
        System.out.println("2- Bicicleta Rock");
        System.out.println("3- Bicicleta Madera");
        String captura = new Scanner(System.in).next();
        try {
            int opcion = Integer.valueOf(captura);
            switch (opcion) {
                case 1:
                    sd.definirTipoBici("Class");
                    break;
                case 2:
                    sd.definirTipoBici("Rock");
                    break;
                case 3:
                    sd.definirTipoBici("Madera");
                    break;
                default:
                    System.out.println("La opcion ingresada no es correcta.");
                    break;
            }
            sd.crearSilla();
        } catch (NumberFormatException nfe) {
            System.out.println("La opcion ingresada no es valida.");
        } catch (ClassNotFoundException ex) {
            System.out.println("El tipo de Bicicleta no esta especificado.");
        }
    }
}
