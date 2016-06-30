/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Andres Mauricio Hastamorir 20142020001
 */
public class Cliente implements Serializable{
    private String numeroDocumento;
    private String nombre;
    private ArrayList<Bicicleta> bicicletas; 

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
