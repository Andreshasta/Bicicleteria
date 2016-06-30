/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import MenuPrincipal.comando.Comando;
import MenuPrincipal.comando.MostrarCreditos;
import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class MenuAyuda implements Menu {

    ArrayList<InterfazUsuario> listaMenus;

    public MenuAyuda() {
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
    public void registrarMenus(Menu elemento) {
        listaMenus.add(new ObtenerOpcion());
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("\t\tAyuda");
        System.out.println();
        System.out.println("Por favor seleccione la opción que desea ejecutar: ");
        System.out.println("\t1) Acerca del programador");
        System.out.println();
        System.out.println("\t0) Atras");
        System.out.print("Opcion: ");
    }

    @Override
    public void procesarOpcion(int opcion) {
        Comando cmd;
        switch (opcion) {
            case 1:
                cmd = new MostrarCreditos();
                cmd.ejecutar();
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
