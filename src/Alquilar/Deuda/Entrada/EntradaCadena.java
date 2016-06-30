/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alquilar.Deuda.Entrada;

import java.util.Scanner;

/**
 *
 * @author AndresMauricio
 */
public class EntradaCadena {

    Scanner entrada1;
    String dato1;
    

    public EntradaCadena() {
        entrada1 = new Scanner(System.in);
    }

    public String getDato1() {
        dato1 = entrada1.next();
        return dato1;
    }

    public void setDato1(String dato1) {
        this.dato1 = dato1;
    }

   
    

}
