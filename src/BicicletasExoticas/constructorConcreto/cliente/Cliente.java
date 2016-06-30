/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicicletasExoticas.constructorConcreto.cliente;

import BicicletasExoticas.constructorConcreto.patron.Bicicleta;
import BicicletasExoticas.constructorConcreto.patron.BicicletaCiudad;
import BicicletasExoticas.constructorConcreto.patron.Periodico;

/**
 *
 * @author Andres
 */
public class Cliente {

    public static void mostrarNoticias(Bicicleta noticia) {
        System.out.println( noticia.getNoticia() );
    }

    public static void main(String[] args) {
        Periodico periodico = new Periodico();
        
        Bicicleta noticiaPeriodico1 = new BicicletaCiudad();
        noticiaPeriodico1.setNoticia("Alerta. Nueva 1 noticia");
        
        Bicicleta noticiaPeriodico2 = new BicicletaCiudad();
        noticiaPeriodico2.setNoticia("Alerta. Nueva 2 noticia");
        
        Bicicleta noticiaPeriodico3 = new BicicletaCiudad();
        noticiaPeriodico3.setNoticia("Alerta. Nueva 3 noticia");
        
        periodico.agregar(noticiaPeriodico1);
        periodico.agregar(noticiaPeriodico2);
        mostrarNoticias(periodico);
        mostrarNoticias(noticiaPeriodico3);
    }
}
