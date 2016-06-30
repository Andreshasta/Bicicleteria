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
public class BusEjecutivo40 implements Kilometraje {

    private Kilometraje km;
    private SalarioMinimo salario;

    

    @Override
    public Kilometraje getSiguiente() {
        return km;
    }

    @Override
    public void categoriaTiquet(double kilometro) {
      if (kilometro < 300 && kilometro >= 100) {

            salario=SalarioMinimo.getInstancia();
            System.out.println("Su pasaje tiene un costo de "+(salario.getValor()/40)+" pesos, su viaje se realizará en Bus Expreso");
        } else {
            km.categoriaTiquet(kilometro);

        }
    }
    @Override
    public void setSiguiente(Kilometraje kilometro) {

        km = kilometro;
    }
}
