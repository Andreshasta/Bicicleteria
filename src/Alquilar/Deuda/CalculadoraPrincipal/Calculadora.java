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
    private final Entrada entrada;

    public Calculadora() {
        entrada = new AdaptadorCadenaANumero();
    }

    public void leer() {
        operando1 = entrada.integrado1();

    }

    public double getSumando1() {
        return operando1;
    }

    public double setSumando1() {
        return operando1;
    }

}
