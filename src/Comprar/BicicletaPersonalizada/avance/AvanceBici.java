/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaPersonalizada.avance;

import Comprar.BicicletaPersonalizada.Abstraccion.Bicicleta;

/**
 *
 * @author Andres
 */
public abstract class AvanceBici {
    private String tipoAvance;

    public String getTipoAvance() {
        return tipoAvance;
    }

    public void setTipoAvance(String tipoAvance) {
        this.tipoAvance = tipoAvance;
    }
    
    public abstract void avanzar(String objetivo);
}
