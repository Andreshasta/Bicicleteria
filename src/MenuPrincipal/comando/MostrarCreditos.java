/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal.comando;

/**
 *
 * @author Edwin
 */
public class MostrarCreditos implements Comando{

    @Override
    public void ejecutar() {
        System.out.println("Desarrollado por Andres Mauricio Hastamorir");
        System.out.println("Para la Universidad Distrital Francisco Jose de Caldas");
        System.out.println("En el curso de modelos de programación");
    }
    
}
