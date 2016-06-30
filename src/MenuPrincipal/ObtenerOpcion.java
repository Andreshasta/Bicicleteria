/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

/**
 *
 * @author Edwin
 */
public class ObtenerOpcion implements InterfazUsuario {

    private int opcionInt;

    @Override
    public int desplegar() {
        leerOpcion();
        System.out.println("La opcion elegida es: " + this.opcionInt);
        return opcionInt;
    }

    private void leerOpcion() {
        manejoarchivos.entradasalida.Lee lector = new manejoarchivos.entradasalida.Lee();
        opcionInt=-1;
        String opcion=null;
        try {
            opcion = lector.leerValor(1);
            opcionInt = Integer.parseInt( opcion );
        } catch (NumberFormatException nfe) {
            System.out.println(nfe.getCause());
            opcionInt = -1;
            System.out.println("Por favor ingrese le número de la opción.");
            //JOptionPane.showMessageDialog(null, "Por favor ingrese el número de opción");
        }

        //return opcion;
    }
}
