/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.cliente;

import Comprar.BicicletaArmada.producto.empaste.Empaste;
import Comprar.BicicletaArmada.producto.encuadernado.Encuadernado;
import Comprar.BicicletaArmada.producto.paginado.Paginado;

/**
 *
 * @author AndresMauricio
 */
public class Cuaderno {
    private String marca;
    private Empaste empastado;
    private Paginado paginado;
    private Encuadernado encuadernado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Empaste getEmpastado() {
        return empastado;
    }

    public void setEmpastado(Empaste empastado) {
        this.empastado = empastado;
    }

    public Paginado getPaginado() {
        return paginado;
    }

    public void setPaginado(Paginado paginado) {
        this.paginado = paginado;
    }

    public Encuadernado getEncuadernado() {
        return encuadernado;
    }

    public void setEncuadernado(Encuadernado encuadernado) {
        this.encuadernado = encuadernado;
    }
    
}
