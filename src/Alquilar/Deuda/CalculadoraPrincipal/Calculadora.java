/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquilar.Deuda.CalculadoraPrincipal;

import Alquilar.Deuda.Entrada.Entrada;
import Alquilar.Deuda.Entrada.AdaptadorCadenaANumero;
/**
 *
 * @author AndresMauricio
 */
public class Calculadora {
    
    private double operando1;
    private double operando2;
    private final Entrada entrada;

    public Calculadora() {
        entrada=new AdaptadorCadenaANumero();
    }
    public void leer(){
        operando1 = entrada.integrado1();
        operando2 = entrada.integrado1();
    }

    public double getSumando1() {
        return operando1;
    }

    public double setSumando1() {
        return operando1;
    }

    public double setSumando2() {
        return operando2;
    }


    public double getSumando2() {
        return operando2;
    }

    
    
}
