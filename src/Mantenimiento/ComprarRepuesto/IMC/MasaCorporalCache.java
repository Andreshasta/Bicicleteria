/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMC;

/**
 *
 * @author Andres
 */
public class MasaCorporalCache implements IndiceMasaCorporal {

   @Override
    public double CalcularIndice(double peso, double estatura)throws Exception {
        
        System.out.println("Calculando indice con el cache");
        double iMC=peso/(estatura*estatura);
         System.out.println("El indice de masa corporal es: "+iMC);
         return iMC;
    }
 

}
