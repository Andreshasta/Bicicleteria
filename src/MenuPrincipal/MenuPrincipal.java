/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class MenuPrincipal implements Menu{

    ArrayList<InterfazUsuario> listaMenus;

    public MenuPrincipal() {
        listaMenus = new ArrayList<>();
    }

    @Override
    public void registrarMenus(Menu menu) {
        listaMenus.add(new ObtenerOpcion());
        listaMenus.add(new MenuRegistrar());
        listaMenus.add(new MenuComprar());
        listaMenus.add(new MenuAlquilar());
        listaMenus.add(new MenuMantenimiento());
        listaMenus.add(new MenuAyuda());
    }

    @Override
    public int desplegar() {
        int opcion = -1;
        registrarMenus(null);
        do {
            mostrarOpciones();
            opcion = listaMenus.get(0).desplegar();
            procesarOpcion(opcion);
        } while (opcion != 0);
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

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                listaMenus.get(1).desplegar();
                break;
            case 2:
                listaMenus.get(2).desplegar();
                break;
            case 3:
                listaMenus.get(3).desplegar();
                break;
            case 4:
                listaMenus.get(4).desplegar();
                break;
            case 5:
                listaMenus.get(4).desplegar();
                break;
            case 99:
                listaMenus.get(5).desplegar();
                break;
            case 0:
                System.out.println("Gracias por atención.");
                break;
            default:
                System.out.println("La opción no es correcta.");
                break;
        }
    }
}
