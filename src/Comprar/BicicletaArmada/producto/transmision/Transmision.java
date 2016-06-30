/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.producto.transmision;

/**
 *
 * @author AndresMauricio
 */
public abstract class Transmision {
    private String tipoTransmision;

    public String getTipoPaginado() {
        return tipoTransmision;
    }

    public void setTipoPaginado(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }
    
}
