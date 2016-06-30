/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.fabrica;

import Comprar.BicicletaArmada.producto.empaste.Plastica;
import Comprar.BicicletaArmada.producto.encuadernado.Cosido;
import Comprar.BicicletaArmada.producto.paginado.H200;

/**
 *
 * @author AndresMauricio
 */
public class FabCuadernoScribe extends FabricaAbstracta {

    public FabCuadernoScribe() {
        this.setMarca("Scribe");
        this.crearEmpaste();
        this.crearEncuadernado();
        this.crearPaginado();
    }

    @Override
    public void crearEmpaste() {
        setEmpastado(new Plastica());
    }

    @Override
    public void crearEncuadernado() {
        setEncuadernado(new Cosido());
    }

    @Override
    public void crearPaginado() {
        setPaginado(new H200());
    }

}
