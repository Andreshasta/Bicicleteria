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
public class Multiplicacion extends Calculadora {
    public Multiplicacion() {
        super();
    }
    
    public double multiplicacion(){
        return getSumando1() * getSumando2();
    }
}
