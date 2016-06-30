/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.fabrica;

import Comprar.BicicletaArmada.producto.empaste.Blanda;
import Comprar.BicicletaArmada.producto.encuadernado.Argollado;
import Comprar.BicicletaArmada.producto.paginado.H100;

/**
 *
 * @author AndresMauricio
 */
public class FabCuadernoNorma extends FabricaAbstracta{

    public FabCuadernoNorma() {
        this.setMarca("Norma");
        this.crearEmpaste();
        this.crearEncuadernado();
        this.crearPaginado();
    }

    @Override
    public void crearEmpaste() {
        setEmpastado(new Blanda());
    }

    @Override
    public void crearEncuadernado() {
        setEncuadernado(new Argollado());
    }

    @Override
    public void crearPaginado() {
        setPaginado(new H100());
    }
    
}
