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
public class SemicarreraAdulto implements Categoria {

    private Categoria km;
    private ValorBicicleta valor;

    @Override
    public Categoria getSiguiente() {
        return km;
    }

    @Override
    public void categoriaTiquet(double categoria) {
        if (categoria >90) {
            valor = ValorBicicleta.getInstancia();
           System.out.println("Su mantenimiento "
                    + "será realizado por técnicos de primera linea, "
                    + "tardará un tiempo aproximado de cuatro horas y tiene un "
                    + "costo de  "+((valor.getValor()*(10/100)+100000)+" pesos"));
        } else {
            km.categoriaTiquet(categoria);

        }
    }

    @Override
    public void setSiguiente(Categoria categoria) {
        km = categoria;
    }
}
