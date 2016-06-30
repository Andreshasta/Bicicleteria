/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejador;

import ManejadorConcreto.Airbus;
import ManejadorConcreto.Avion;
import ManejadorConcreto.BusEjecutivo40;
import ManejadorConcreto.BusEjecutivo50;
import ManejadorConcreto.BusEjecutivoCentesimo;
import ManejadorConcreto.JetPrivado;
import ManejadorConcreto.MetroTokio;
import ManejadorConcreto.TransporteGratis;

/**
 *
 * @author Andres
 */
public class TerminalTransporte implements Kilometraje {

    private Kilometraje km;

    @Override
    public void setSiguiente(Kilometraje kilometro) {
        km = kilometro;
    }

    @Override
    public Kilometraje getSiguiente() {
        return km;
    }

    @Override
    public void categoriaTiquet(double kilometro) {
        TransporteGratis pasajeroGratis = new TransporteGratis();
        this.setSiguiente(pasajeroGratis);

        BusEjecutivoCentesimo Pasajerocentesimo = new BusEjecutivoCentesimo();
        pasajeroGratis.setSiguiente(Pasajerocentesimo);

        BusEjecutivo50 pasajero50 = new BusEjecutivo50();
        Pasajerocentesimo.setSiguiente(pasajero50);

        BusEjecutivo40 pasajero40 = new BusEjecutivo40();
        pasajero50.setSiguiente(pasajero40);

        Avion pasajeroAvion = new Avion();
        pasajero40.setSiguiente(pasajeroAvion);

        Airbus pasajeroAirbus = new Airbus();
        pasajeroAvion.setSiguiente(pasajeroAirbus);

        MetroTokio pasajeroMetro = new MetroTokio();
        pasajeroAirbus.setSiguiente(pasajeroMetro);

        JetPrivado pasajeroPrivado = new JetPrivado();
        pasajeroMetro.setSiguiente(pasajeroPrivado);

        km.categoriaTiquet(kilometro);

    }

}
