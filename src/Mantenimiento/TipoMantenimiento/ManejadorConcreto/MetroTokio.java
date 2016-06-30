/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadorConcreto;

import Entrada.SalarioMinimo;
import Manejador.Kilometraje;

/**
 *
 * @author Andres
 */
public class MetroTokio implements Kilometraje {

    private Kilometraje km;
    private SalarioMinimo salario;

    @Override
    public Kilometraje getSiguiente() {
        return km;
    }

    @Override
    public void categoriaTiquet(double kilometro) {
        if (kilometro < 1500 && kilometro >= 800) {
            salario = SalarioMinimo.getInstancia();
            System.out.println("Su pasaje tiene un costo de " + (salario.getValor() *3) + " pesos, su viaje se realizará en Metro 300 km/h");
        } else {
            km.categoriaTiquet(kilometro);

        }
    }

    @Override
    public void setSiguiente(Kilometraje kilometro) {
        km = kilometro;
    }
}
