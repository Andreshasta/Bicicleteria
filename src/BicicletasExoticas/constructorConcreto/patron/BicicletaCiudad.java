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
public class BicicletaCiudad extends Bicicleta{
    private String mensaje;
    @Override
    public void moverNoticia() {
        System.out.println("Pasando a la siguiente página");
    }

    @Override
    public void setNoticia(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getNoticia() {
        return mensaje;
    }
    
}
