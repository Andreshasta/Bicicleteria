/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BicicletasExoticas.constructorConcreto.patron;

/**
 *
 * @author Andres
 */
public abstract class Bicicleta {
    //public abstract void agregar(DocumentoNoticia documento);
    //public abstract void remover(int i);
    public abstract void setNoticia(String mensaje);
    public abstract void moverNoticia();
    public abstract String getNoticia();
}
