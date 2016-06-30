/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.TipoMantenimiento.ManejadorConcreto;

import Mantenimiento.TipoMantenimiento.Entrada.ValorBicicleta;
import Mantenimiento.TipoMantenimiento.Manejador.Categoria;

/**
 *
 * @author Andres
 */
public class Jovenes24 implements Categoria {

    private Categoria km;
    private ValorBicicleta valor;

    @Override
    public Categoria getSiguiente() {
        return km;
    }

    @Override
    public void categoriaTiquet(double categoria) {
        if (categoria <= 30 && categoria >= 21) {

           valor=ValorBicicleta.getInstancia();
             System.out.println("Su mantenimiento "
                    + "será realizado por técnicos de cuarta linea, "
                    + "tardará un tiempo aproximado de una hora y tiene un "
                    + "costo de  "+((valor.getValor()*(10/100))+20000+" pesos"));
        } else {
            km.categoriaTiquet(categoria);

        }
    }

    @Override
    public void setSiguiente(Categoria categoria) {
        km = categoria;
    }
}
