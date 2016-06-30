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
public class ClasificacionIMCProxy implements ClasificacionIMC {
 private  ClasificacionIMC clasificador;
    @Override
    public void clasificarIMC(double imc) throws Exception {
        try {
            clasificador=new ClasificacionIMCReal();
            clasificador.clasificarIMC(imc);
        } catch (Exception e) {
        clasificador=new ClasificacionIMCRealCache();
            clasificador.clasificarIMC(imc);
        }
    }
    
    
}
