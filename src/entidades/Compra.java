/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Calendar;

/**
 *
 * @author Andres Mauricio Hastamorir 20142020001
 */
public class Compra implements Deuda{
    private Cliente cliente;
    private Calendar fechaCompra;
    private double valor;
    private String naturaleza;
}