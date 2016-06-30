/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrada;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Lectura {

    Scanner entrada = new Scanner(System.in);

    public double ingresarEntrada() {
        System.out.println("Ingrese la cantidad de kilometros a recorrer: ");
        double valor = entrada.nextDouble();
        return valor;
    }
    public double ingresarSueldo() {
        System.out.println("Ingrese el valor del salario minimo: ");
        double valor = entrada.nextDouble();
        return valor;
    }
    
}
