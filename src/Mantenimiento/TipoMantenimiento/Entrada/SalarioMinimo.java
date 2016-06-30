/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

/**
 *
 * @author Andres
 */
public class SalarioMinimo {

    private static SalarioMinimo instancia;
    private double valor;

    private SalarioMinimo() {
    }

    public static SalarioMinimo getInstancia() {
        if (instancia == null) {
            instancia = new SalarioMinimo();
        }
        return instancia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
