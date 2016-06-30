/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquilar.Deuda.Vista;

import Alquilar.Deuda.CalculadoraPrincipal.Division;
import Alquilar.Deuda.CalculadoraPrincipal.Multiplicacion;
import Alquilar.Deuda.CalculadoraPrincipal.Resta;
import Alquilar.Deuda.CalculadoraPrincipal.Suma;

import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class Pantalla {

    public static void main(String[] args) {
        int operacion=0;
        String selector = JOptionPane.showInputDialog("Ingrese: \n1. Suma \n2. Resta \n3. Multiplicaion \n4. Division");
        try {
            operacion = Integer.parseInt(selector);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "La opcion ingresada no es válida");
        }
        switch (operacion) {
            case 1:
                Suma opSuma = new Suma();
                opSuma.leer();
                System.out.println(opSuma.suma());
                break;
            case 2:
                Resta opResta = new Resta();
                opResta.leer();
                System.out.println(opResta.resta());
                break;
            case 3:
                Multiplicacion opMultiplicacion = new Multiplicacion();
                opMultiplicacion.leer();
                System.out.println(opMultiplicacion.multiplicacion());
                break;
            case 4:
                Division opDivision = new Division();
                opDivision.leer();
                try{
                System.out.println(opDivision.division());
                }catch(ArithmeticException ae){
                    System.out.println("Error.");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Esta operacion no se encuentra");
        }
    }

}
