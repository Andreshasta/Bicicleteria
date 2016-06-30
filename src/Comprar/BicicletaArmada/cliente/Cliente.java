/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.cliente;

import Comprar.BicicletaArmada.fabrica.FabCuadernoAndaluz;
import Comprar.BicicletaArmada.fabrica.FabCuadernoNorma;
import Comprar.BicicletaArmada.fabrica.FabCuadernoScribe;
import Comprar.BicicletaArmada.fabrica.FabricaAbstracta;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class Cliente {

    FabricaAbstracta fabrica;
    Cuaderno cuaderno;

    public void ingreso() {
        int opcion = 0;
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog(null, "Seleccione la marca del cuaderno que desea: \n1. Norma \n2. Scribe \n3. Andaluz \n4. Salir");
            try {
                if (entrada != null) {
                    opcion = Integer.parseInt(entrada);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "dato ingresado no valido.");
                opcion = 0;
            }
            if (opcion != 0) {
                procesarEntrada(opcion);
            }
        } while (opcion != 4 );
    }

    private void procesarEntrada(int entrada) {
        switch (entrada) {
            case 1:
                fabrica = new FabCuadernoNorma();
                obtenerCuaderno();
                mostrarCuaderno();
                break;
            case 2:
                fabrica = new FabCuadernoScribe();
                obtenerCuaderno();
                mostrarCuaderno();
                break;
            case 3:
                fabrica = new FabCuadernoAndaluz();
                obtenerCuaderno();
                mostrarCuaderno();
                break;
            case 4:
                break;
            default:
                JOptionPane.showMessageDialog(null, "seleccion incorrecta");
        }
    }

    public void obtenerCuaderno() {
        cuaderno = new Cuaderno();
        cuaderno.setMarca(fabrica.getMarca());
        cuaderno.setEmpastado(fabrica.getEmpastado());
        cuaderno.setEncuadernado(fabrica.getEncuadernado());
        cuaderno.setPaginado(fabrica.getPaginado());
    }

    public void mostrarCuaderno() {
        JOptionPane.showMessageDialog(null, "Cuaderno \nmarca: " + cuaderno.getMarca() + "\nEmpaste: "
                + cuaderno.getEmpastado().getTipoEmpaste() + "\nEncuadernado: "
                + cuaderno.getEncuadernado().getTipoEncuadernado() + "\nPaginado: "
                + cuaderno.getPaginado().getTipoPaginado());
    }
}
