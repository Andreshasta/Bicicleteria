/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.fabrica;

import Comprar.BicicletaArmada.producto.empaste.Dura;
import Comprar.BicicletaArmada.producto.encuadernado.Pegado;
import Comprar.BicicletaArmada.producto.paginado.H50;

/**
 *
 * @author AndresMauricio
 */
public class FabCuadernoAndaluz extends FabricaAbstracta {

    public FabCuadernoAndaluz() {
        this.setMarca("Andaluz");
        this.crearEmpaste();
        this.crearEncuadernado();
        this.crearPaginado();
    }

    @Override
    public void crearEmpaste() {
        setEmpastado(new Dura());
    }

    @Override
    public void crearEncuadernado() {
        setEncuadernado(new Pegado());
    }

    @Override
    public void crearPaginado() {
        setPaginado(new H50());
    }

}
