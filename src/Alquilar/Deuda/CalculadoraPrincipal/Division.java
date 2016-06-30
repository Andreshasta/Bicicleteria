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
public class Division extends Calculadora {

    public Division() {
        super();
    }

    public double division() {
        double resultado;
        if (getSumando2() !=0){
        resultado = getSumando1() / getSumando2();
        return resultado;
        }else{
            throw new ArithmeticException();
        }
    }
}
