/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Andres Mauricio Hastamorir 20142020001
 */
public class Mantenimiento implements Serializable{
    private Calendar fechaSolicitud;
    private Cliente cliente;
    private ArrayList<Repuesto> listaRepuestos;
    private ArrayList<Bicicleta> listaBicicletas;
}
