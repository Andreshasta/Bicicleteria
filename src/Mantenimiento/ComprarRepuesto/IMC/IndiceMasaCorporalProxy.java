/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMC;

/**
 *
 * @author AndresMauricio
 */
public class IndiceMasaCorporalProxy implements IndiceMasaCorporal {

   private IndiceMasaCorporal masaCorporal;

    @Override
    public double CalcularIndice(double peso, double estatura) throws Exception{
        try {
            masaCorporal = new MasaCorporal();
            return masaCorporal.CalcularIndice(peso, estatura);
        } catch (Exception ex) {
            masaCorporal = new MasaCorporalCache();
            return masaCorporal.CalcularIndice(peso, estatura);
        }
    }

}
