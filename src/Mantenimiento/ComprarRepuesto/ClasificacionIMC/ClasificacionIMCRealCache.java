/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasificacionIMC;

/**
 *
 * @author Andres
 */
public class ClasificacionIMCRealCache implements ClasificacionIMC{

    @Override
    public void clasificarIMC(double imc) throws Exception {
        if (imc < 16) {
            System.out.println("Delgadez severa");
        } else if (imc < 17) {
            System.out.println("Delgadez moderada");
        } else if (imc < 18.5) {
            System.out.println("Delgadez leve");
        }else if(imc< 25){
            System.out.println("Normal");
        }else if(imc< 30){
            System.out.println("Preobeso");
        }else if(imc< 35){
            System.out.println("Obesidad leve");
        }else if(imc< 40){
            System.out.println("Obesidad media");
        }else if(imc>=40){
            System.out.println("Obesidad morbida");
        }
    }
    
}
