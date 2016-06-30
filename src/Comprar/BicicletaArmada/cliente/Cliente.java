/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comprar.BicicletaArmada.cliente;

import Comprar.BicicletaArmada.fabrica.FabBiciCross;
import Comprar.BicicletaArmada.fabrica.FabBiciPlayera;
import Comprar.BicicletaArmada.fabrica.FabBiciSemicarrera;
import Comprar.BicicletaArmada.fabrica.FabricaAbstracta;
import javax.swing.JOptionPane;

/**
 *
 * @author AndresMauricio
 */
public class Cliente {

    FabricaAbstracta fabrica;
    Bicicleta bici;

    public void ingreso() {
        int opcion = 0;
        String entrada;
        do {
            entrada = JOptionPane.showInputDialog(null, "Seleccione la marca del cuaderno que desea: \n1. Playera \n2. Semicarrera \n3. Cross \n4. Salir");
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
                fabrica = new FabBiciPlayera();
                obtenerCuaderno();
                mostrarCuaderno();
                break;
            case 2:
                fabrica = new FabBiciSemicarrera();
                obtenerCuaderno();
                mostrarCuaderno();
                break;
            case 3:
                fabrica = new FabBiciCross();
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
        bici = new Bicicleta();
        bici.setMarca(fabrica.getMarca());
        bici.setEmpastado(fabrica.getMarco());
        bici.setEncuadernado(fabrica.getLLanta());
        bici.setPaginado(fabrica.getCambio());
    }

    public void mostrarCuaderno() {
        JOptionPane.showMessageDialog(null, "Cuaderno \nmarca: " + bici.getMarca() + "\nEmpaste: "
                + bici.getEmpastado().getTipoEmpaste() + "\nEncuadernado: "
                + bici.getEncuadernado().getTipoEncuadernado() + "\nPaginado: "
                + bici.getPaginado().getTipoPaginado());
    }
}
