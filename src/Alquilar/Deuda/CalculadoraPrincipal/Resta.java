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
public class Resta extends Calculadora {
     public Resta() {
        super();
    }
    
    public double resta(){
        return getSumando1() - getSumando2();
    }
}
