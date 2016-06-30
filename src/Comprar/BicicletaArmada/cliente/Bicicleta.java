/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.cliente;

import Comprar.BicicletaArmada.producto.marco.Marco;
import Comprar.BicicletaArmada.producto.enllantado.Llanta;
import Comprar.BicicletaArmada.producto.transmision.Transmision;

/**
 *
 * @author AndresMauricio
 */
public class Bicicleta {
    private String marca;
    private Marco empastado;
    private Transmision paginado;
    private Llanta encuadernado;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Marco getEmpastado() {
        return empastado;
    }

    public void setEmpastado(Marco empastado) {
        this.empastado = empastado;
    }

    public Transmision getPaginado() {
        return paginado;
    }

    public void setPaginado(Transmision paginado) {
        this.paginado = paginado;
    }

    public Llanta getEncuadernado() {
        return encuadernado;
    }

    public void setEncuadernado(Llanta encuadernado) {
        this.encuadernado = encuadernado;
    }
    
}
