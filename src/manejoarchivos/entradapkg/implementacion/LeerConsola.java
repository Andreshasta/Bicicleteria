/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos.entradapkg.implementacion;

import manejoarchivos.entradapkg.especificacion.InterfaceEntrada;
import java.util.Scanner;

/**
 *
 * @author AndresMauricio
 */
public class LeerConsola implements InterfaceEntrada{

    @Override
    public String leer() {
        Scanner entrada = new Scanner(System.in);
        String consola = entrada.nextLine();
        return consola;
    }

}
