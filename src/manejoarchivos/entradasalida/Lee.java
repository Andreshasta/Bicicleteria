/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos.entradasalida;

import manejoarchivos.entradapkg.especificacion.InterfaceEntrada;
import manejoarchivos.entradapkg.implementacion.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class Lee {

    int ingreso;

    public Lee() {
        /*String captura;
        captura = JOptionPane.showInputDialog(null, "Seleccione su metodo de entrada: \n1. Entrada por consola \n2. Entrada por Archivo \n3. Entrada por Interfaz");
        try {
            ingreso = Integer.parseInt(captura);
        }catch(NumberFormatException nfe)  {
            JOptionPane.showMessageDialog(null, "dato ingresado no valido.");
        }*/
    }

    public String leerValor(int ingreso) {
        InterfaceEntrada ingresado;
        switch (ingreso) {
            case 1:
                ingresado = new LeerConsola();
                return ingresado.leer();
            case 2:
                ingresado = new LeerArchivo();
                return ingresado.leer();
            case 3:
                ingresado = new LeerInterfaz();
                return ingresado.leer();
            default:
                JOptionPane.showMessageDialog(null, "seleccion incorrecta");
        }
        return null;
    }

}
