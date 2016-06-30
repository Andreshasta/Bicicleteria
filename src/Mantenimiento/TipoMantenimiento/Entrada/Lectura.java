/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.TipoMantenimiento.Entrada;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Lectura {

    Scanner entrada = new Scanner(System.in);

    public double ingresarEntrada() {
        System.out.println("Ingrese la categoría de su bicicleta:"
                + "\n\t  de 1 a 10 bicicletas para niños rin 16 "
                + "\n\t  de 11 a 20 bicicletas para niños rin 20 no profesional"
                + "\n\t  de 21 a 30 bicicletas para jovenes rin 24"
                + "\n\t  de 31 a 40 bicicletas para adultos rin 26 no profesional"
                + "\n\t  de 41 a 50 bicicletas playeras todo tamaño"
                + "\n\t  de 51 a 60 bicicletas tipo cross profesional"
                + "\n\t  de 61 a 70 bicicletas todoterreno para competencia junior"
                + "\n\t  de 71 a 80 bicicletas todoterreno para competencia profesional"
                + "\n\t  de 81 a 90 bicicletas Semicarrera para competencia Junior"
                + "\n\t  de 91 a 100 bicicletas Semicarrera para competencia profesional ");
        double valor = entrada.nextDouble();
        return valor;
    }
    public double ingresarValor() {
        System.out.println("Ingrese el valor de la bicicleta, la cual tendrá seguro todoriesgo: ");
        double valor = entrada.nextDouble();
        return valor;
    }
    
}
