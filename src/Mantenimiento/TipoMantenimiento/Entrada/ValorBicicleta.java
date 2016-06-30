/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.TipoMantenimiento.Entrada;

/**
 *
 * @author Andres
 */
public class ValorBicicleta {

    private static ValorBicicleta instancia;
    private double valor;

    private ValorBicicleta() {
    }

    public static ValorBicicleta getInstancia() {
        if (instancia == null) {
            instancia = new ValorBicicleta();
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
