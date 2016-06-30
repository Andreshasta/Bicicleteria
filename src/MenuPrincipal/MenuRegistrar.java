/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class MenuRegistrar implements Menu {

    ArrayList<InterfazUsuario> listaMenus;

    public MenuRegistrar() {
    }

    @Override
    public int desplegar() {
        int opcion;
        registrarMenus(null);
        opcion = listaMenus.get(0).desplegar();
        return opcion;
    }

    public void mostrarOpciones() {
        System.out.println("Bienvenido a El Universal");
        System.out.println();
        System.out.println("Por favor seleccione la opción que desea ejecutar: ");
        System.out.println("\t1) Registrar cliente");
        System.out.println("\t2) Comprar una bicicleta");
        System.out.println("\t3) Alquilar una bicicleta");
        System.out.println("\t4) Solicitar mantenimiento de su bicibleta");
        System.out.println("\t5) Comprar partes o accesorios");
        System.out.println();
        System.out.println("\t99) Ver creditos");
        System.out.println("\t0) Salir");
        System.out.print("Opcion: ");
    }

    @Override
    public void registrarMenus(Menu elemento) {
        listaMenus.add(new ObtenerOpcion());
    }
}
