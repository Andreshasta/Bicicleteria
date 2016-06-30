/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.TipoMantenimiento.Manejador;

/**
 *
 * @author Andres
 */
public  interface Categoria {
    
    public Categoria getSiguiente();
    public void categoriaTiquet(double categoria);
    public void setSiguiente(Categoria categoria);
    
    
    
}
