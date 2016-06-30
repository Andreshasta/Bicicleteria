/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.fabrica;

import Comprar.BicicletaArmada.producto.marco.Marco;
import Comprar.BicicletaArmada.producto.enllantado.Llanta;
import Comprar.BicicletaArmada.producto.transmision.Transmision;

/**
 *
 * @author AndresMauricio
 */
public abstract class FabricaAbstracta {

    private String tipo;
    private Marco marco;
    private Transmision cambio;
    private Llanta llanta;

    public abstract void crearMarco();

    public abstract void crearLlantas();

    public abstract void crearTransmision();

    public String getMarca() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Marco getMarco() {
        return marco;
    }

    void setMarco(Marco marco) {
        this.marco = marco;
    }

    public Transmision getCambio() {
        return cambio;
    }

    void setCambio(Transmision cambio) {
        this.cambio = cambio;
    }

    public Llanta getLLanta() {
        return llanta;
    }

    void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }
}
