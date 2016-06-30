/*
 * To change this license h

 eader, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquilar.Deuda.Entrada;

/**
 *
 * @author AndresMauricio
 */
public class AdaptadorCadenaANumero implements Entrada {

    private int numeroA;
    private EntradaCadena entrada;

    public AdaptadorCadenaANumero() {
        entrada = new EntradaCadena();
        numeroA = 0;
    }

    @Override
    public int integrado1() {
        try {
            numeroA = Integer.parseInt(entrada.getDato1());
            return numeroA;
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }
}
