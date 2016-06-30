/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.ComprarRepuesto.lectura;


import java.util.Scanner;

/**
 *
 * @author AndresMauricio
 */
public class LeerConsola {

    public static double leer(String mensaje) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite "+mensaje);
        double consola = entrada.nextDouble();
        return consola;
    }
     

}
