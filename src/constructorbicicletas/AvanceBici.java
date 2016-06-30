/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorbicicletas;

/**
 *
 * @author Edwin
 */
public abstract class AvanceBici {
    String tipoAvance;

    public String getTipoAvance() {
        return tipoAvance;
    }

    public void setTipoAvance(String tipoAvance) {
        this.tipoAvance = tipoAvance;
    }
    public abstract void avanzar(String objetivo);
}
