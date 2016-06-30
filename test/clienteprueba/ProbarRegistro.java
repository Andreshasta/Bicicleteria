/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteprueba;

import java.util.Scanner;
import registrocliente.ClienteIngreso;
import registrocliente.RegistrarCliente;

/**
 *
 * @author Edwin
 */
public class ProbarRegistro {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        ClienteIngreso cliente = new ClienteIngreso();
        System.out.println("Ingrese nombre");
        cliente.setNombre(sc.next());
        System.out.println("Ingrese numero doc");
        cliente.setNumeroDoc(sc.next());
        RegistrarCliente registrar = new RegistrarCliente();
        registrar.guardarInfoCliente(cliente);
        System.out.println("Se envio a guardar");
        if (registrar.validarListaClientes(sc.next())){
        }else{
            System.out.println("NO encontro al cliente indicado");
        }
    }
}
