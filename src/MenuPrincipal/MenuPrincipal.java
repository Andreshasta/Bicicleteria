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
public class MenuPrincipal {

    ArrayList<Menu> listaMenus;

    public MenuPrincipal() {
        listaMenus = new ArrayList<>();
    }

    private void registrarMenus() {
        listaMenus.add(new MenuRegistrar());
        listaMenus.add(new MenuComprar());
        listaMenus.add(new MenuAlquilar());
        listaMenus.add(new MenuMantenimiento());
    }

    public void desplegar() {
        int opcion = -1;
        registrarMenus();
        do {
            mostrarOpciones();
            try {
                opcion = Integer.parseInt(leerOpcion());
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.getCause());
                opcion = -1;
                System.out.println("Por favor ingrese le número de la opción.");
                //JOptionPane.showMessageDialog(null, "Por favor ingrese el número de opción");
            }
            procesarOpcion(opcion);
        } while (opcion != 0);

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

    public String leerOpcion() {
        manejoarchivos.entradasalida.Lee lector = new manejoarchivos.entradasalida.Lee();
        return lector.leerValor(1);
    }

    public void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                listaMenus.get(0);
                break;
            case 2:
                listaMenus.get(1);
                break;
            case 3:
                listaMenus.get(2);
                break;
            case 4:
                listaMenus.get(3);
                break;
            case 5:
                listaMenus.get(4);
                break;
            case 99:
                listaMenus.get(5);
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
