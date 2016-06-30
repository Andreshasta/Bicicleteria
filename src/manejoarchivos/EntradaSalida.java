/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public interface EntradaSalida {
    public void guardarArchivo(Object tipoArchivo, Object dato);
    public ArrayList<Object> leerArchivo(Object tipoArchivo);
    public boolean isGuardado(Object dato);
}
