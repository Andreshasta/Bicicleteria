/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteprueba;

import Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos.base.ConsultorBaseRepuestos;
import Mantenimiento.ComprarRepuesto.ConsultorRepuestos.ConsultorListaRepuestos;
import Mantenimiento.ComprarRepuesto.ConsultorRepuestos.Repuesto;
import MenuPrincipal.Menu;
import MenuPrincipal.MenuPrincipal;
import java.util.ArrayList;
import java.util.Scanner;
import registrocliente.ClienteIngreso;
import registrocliente.RegistrarCliente;

/**
 *
 * @author Edwin
 */
public class ProbarRegistro {
    public static void pruebaRegistro(){
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
    public static void crearListaRepuestos(){
        ConsultorBaseRepuestos cbr = new ConsultorBaseRepuestos();
        ArrayList<Repuesto> listaRepuestos = new ArrayList<>();
        listaRepuestos.add( new Repuesto(1, "Canasta", 25) );
        listaRepuestos.add( new Repuesto(2, "Parrilla", 20) );
        listaRepuestos.add( new Repuesto(3, "Freno", 5) );
        listaRepuestos.add( new Repuesto(4, "Pedal", 5) );
        listaRepuestos.add( new Repuesto(5, "Cadenilla", 18) );
        listaRepuestos.add( new Repuesto(6, "Goma manubrio", 13) );
        listaRepuestos.add( new Repuesto(7, "Caña de sillin", 12) );
        listaRepuestos.add( new Repuesto(8, "Suspensión delantera", 30) );
        listaRepuestos.add( new Repuesto(9, "Suspensión trasera", 24) );
        listaRepuestos.add( new Repuesto(10, "Motor eléctrico", 170) );
        for (int i = 0; i< listaRepuestos.size(); i++){
            cbr.guardarArchivo(listaRepuestos.get(i));
        }
    }
    public static void pruebaListaRepuestos(){
        ConsultorListaRepuestos consultor = new ConsultorListaRepuestos();
        consultor.obtenerListaRepuesto();
    }
    public static void probarAlquilar(){
        Alquilar.cliente.ClienteAlquilador cliente = Alquilar.cliente.ClienteAlquilador.obtenerInstancia();
        cliente.ingreso();
        cliente.obtenerBicicleta();
        cliente.mostrarBicicleta();
    }
    public static void probarIngresoPrincipal(){
        Menu menup = new MenuPrincipal();
        menup.desplegar();
    }
    public static void main (String[] args){
        //pruebaRegistro();
        //pruebaListaRepuestos();
        //crearListaRepuestos(); //Crea la lista de respuestos y la guarda en un archivo.
        //probarAlquilar();
        probarIngresoPrincipal();
    }
}
