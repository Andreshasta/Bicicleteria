/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquilar.Deuda.Vista;


import Alquilar.Deuda.CalculadoraPrincipal.Facturador;


import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class Pantalla {

    public static void main(String[] args) {
        int operacion=0;
         JOptionPane.showMessageDialog(null,"Ingrese el tiempo en minutos");
        try {
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "La opcion ingresada no es válida");
        }
       
              Facturador opMultiplicacion = new Facturador();
                opMultiplicacion.leer();
                System.out.println(opMultiplicacion.multiplicacion());
                
    }

}
