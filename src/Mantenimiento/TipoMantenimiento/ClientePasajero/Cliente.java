/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientePasajero;

import Entrada.Lectura;
import Entrada.SalarioMinimo;
import Manejador.TerminalTransporte;

/**
 *
 * @author Andres
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lectura entrada = new Lectura();
        SalarioMinimo salario = SalarioMinimo.getInstancia();
        salario.setValor(entrada.ingresarSueldo());

        TerminalTransporte pasaje = new TerminalTransporte();
        pasaje.categoriaTiquet(entrada.ingresarEntrada());
        
        
    }

}
