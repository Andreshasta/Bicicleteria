/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manejador;

/**
 *
 * @author Andres
 */
public  interface Kilometraje {
    
    public Kilometraje getSiguiente();
    public void categoriaTiquet(double kilometro);
    public void setSiguiente(Kilometraje kilometro);
    
    
    
}
