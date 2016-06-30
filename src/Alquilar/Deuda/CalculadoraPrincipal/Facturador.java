/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquilar.Deuda.CalculadoraPrincipal;

/**
 *
 * @author AndresMauricio
 */
public class Facturador extends Calculadora {
    public Facturador() {
        super();
    }
    
    public String multiplicacion(){
        double getSumando1 = this.getSumando1()*33.33;
        
        return "El valor es " + getSumando1+" pesos";
    }
}
