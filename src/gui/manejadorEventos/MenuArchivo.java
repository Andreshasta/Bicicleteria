/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.manejadorEventos;

/**
 *
 * @author Edwin
 */
public class MenuArchivo {
    Comando salir;
    Comando ingresar;

    public MenuArchivo() {
        salir = new ComandoSalir();
        ingresar = new ComandoIngresar();
    }

    public Comando getSalir() {
        return salir;
    }

    public Comando getIngresar() {
        return ingresar;
    }

}
