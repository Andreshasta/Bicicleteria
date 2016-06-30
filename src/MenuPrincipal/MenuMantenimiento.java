/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import MenuPrincipal.comando.Comando;
import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class MenuMantenimiento implements Menu {
    
    ArrayList<InterfazUsuario> listaMenus;
    
    public MenuMantenimiento() {
        listaMenus = new ArrayList<>();
    }
    
    @Override
    public int desplegar() {
        int opcion;
        registrarMenus(null);
        do {
            mostrarOpciones();
            opcion = listaMenus.get(0).desplegar();
            procesarOpcion(opcion);
        } while (opcion != 0);
        return opcion;
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("\t\tMantenimiento");
        System.out.println();
        System.out.println("Por favor seleccione la opción que desea ejecutar: ");
        System.out.println("\t1) Solicitar mantenimiento");
        System.out.println("\t2) Ver lista de accesorios");
        System.out.println("\t0) Volver");
        System.out.print("Opcion: ");
    }
    
    @Override
    public void registrarMenus(Menu elemento) {
        listaMenus.add(new ObtenerOpcion());
    }

    @Override
    public void procesarOpcion(int opcion) {
        Comando cmd;
        switch (opcion) {
            case 1:
                System.out.println("Aún en espera.");
                //cmd.ejecutar();
                break;
            case 2:
                System.out.println("Aún en espera.");
                break;
            case 0:
                System.out.println("Volviendo.");
                break;
            default:
                System.out.println("La opción no es correcta.");
                break;
        }
    }
}
