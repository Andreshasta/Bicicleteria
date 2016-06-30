package cliente;


import ClasificacionIMC.ClasificacionIMC;
import ClasificacionIMC.ClasificacionIMCProxy;
import IMC.IndiceMasaCorporal;
import IMC.IndiceMasaCorporalProxy;
import lectura.LeerConsola;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author Andres
 */
public class Cliente {
    
    public static void main(String[] args) {
        double peso=LeerConsola.leer("peso en kg");
        double estatura=LeerConsola.leer("estatura en metros");
        double imc;
        IndiceMasaCorporal indice=new IndiceMasaCorporalProxy();
        ClasificacionIMC clasificador= new ClasificacionIMCProxy();
        
        try {
            imc = indice.CalcularIndice(peso,estatura);
            clasificador.clasificarIMC(imc);
        } catch (Exception ex) {
            System.out.println("error");
        }
    }
    
}
