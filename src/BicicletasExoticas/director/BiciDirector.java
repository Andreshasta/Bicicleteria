/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicicletasExoticas.director;

import BicicletasExoticas.constructor.AbstractBiciExoticaBuilder;
import BicicletasExoticas.constructorConcreto.*;
import BicicletasExoticas. producto.Exotica;

/**
 *
 * @author AndresMauricio
 */
public class BiciDirector {
    private Exotica silla;
    AbstractBiciExoticaBuilder constructor;
    
    public void definirTipoBici(String tipo) throws ClassNotFoundException{
        if (tipo.equalsIgnoreCase("ROCK")){
            constructor = new ConstructorBiciRock();
        } else if (tipo.equalsIgnoreCase("CLASS")){
            constructor = new ConstructorBiciClass();
        } else if (tipo.equalsIgnoreCase("MADERA")){
            constructor = new ConstructorBiciMadera();
        } else {
            throw new ClassNotFoundException();
        }
    }
    public void crearSilla(){
        if (constructor != null){
            constructor.contruirEstilo();
            constructor.construirAsiento();
            constructor.construirLlantas();
            silla = constructor.obtenerBici();
            System.out.println(silla.toString());
        }
    }
}
