/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicicletasExoticas.constructorConcreto.patron;

import java.util.ArrayList;

/**
 *
 * @author Andres
 */
public class Periodico extends Bicicleta{
    ArrayList<Bicicleta> documentos;

    public Periodico() {
        documentos = new ArrayList<>();
    }
    
    public void agregar(Bicicleta documento) {
        documentos.add(documento);
    }

    public void remover(int i) {
        documentos.remove(i);
    }

    @Override
    public void moverNoticia() {
        for(int i=0; i<documentos.size(); i++){
            documentos.get(i).moverNoticia();
        }
    }

    @Override
    public void setNoticia(String mensaje) {
        System.out.println("No alberga mensajes.");
    }

    @Override
    public String getNoticia() {
        String noticias = "";
        for(int i=0; i<documentos.size(); i++){
            noticias = noticias+documentos.get(i).getNoticia()+" - ";
        }
        return noticias;
    }
    
}
