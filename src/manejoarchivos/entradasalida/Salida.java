/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos.entradasalida;

import manejoarchivos.salidapkg.especificacion.InterfaceSalida;
import manejoarchivos.salidapkg.implementacion.SalidaArchivo;
import manejoarchivos.salidapkg.implementacion.SalidaInterfazUI;
import manejoarchivos.salidapkg.implementacion.SalidaConsola;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class Salida {

    int opcion;
    String dato;
    
    public Salida() {
        /*String captura;
        captura = JOptionPane.showInputDialog(null, "Seleccione su metodo de Salida: \n1. Salida por consola \n2. Salida por Archivo \n3. Salida por Interfaz");
        try {
            opcion = Integer.parseInt(captura);
        }catch(NumberFormatException nfe)  {
            JOptionPane.showMessageDialog(null, "dato ingresado no valido.");
        }*/
    }
    
    public void salidaValor(int opcion) {
        InterfaceSalida salidaDato;
        switch (opcion) {
            case 1:
                salidaDato = new SalidaConsola();
                salidaDato.salida(dato);
                break;
            case 2:
                salidaDato = new SalidaArchivo();
                salidaDato.salida(dato);
                break;
            case 3:
                salidaDato = new SalidaInterfazUI();
                salidaDato.salida(dato);
               break;
            default:
                JOptionPane.showMessageDialog(null, "seleccion incorrecta");
        }
        
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
}
