/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import java.util.Scanner;
import registrocliente.ClienteIngreso;

/**
 *
 * @author Edwin
 */
public class Empresa {
    private String nombre;
    private Alquilar.cliente.ClienteAlquilador clienteAlquilador;
    private Comprar.BicicletaArmada.cliente.ClienteComprador clienteComSencillo;
    private Mantenimiento.TipoMantenimiento.ClientePasajero.ClienteGarantia clienteGarantia;
    private Mantenimiento.ComprarRepuesto.ConsultorRepuestos.ConsultorListaRepuestos clientePartes;
    private registrocliente.RegistrarCliente registroCliente;
    
    public void seleccionarBiciAlquilar(){
        clienteAlquilador = Alquilar.cliente.ClienteAlquilador.obtenerInstancia();
        clienteAlquilador.ingreso();
        clienteAlquilador.obtenerBicicleta();
        clienteAlquilador.mostrarBicicleta();
    }
    public void comprar(){
        clienteComSencillo = new Comprar.BicicletaArmada.cliente.ClienteComprador();
        clienteComSencillo.ingreso();
        clienteComSencillo.obtenerCuaderno();
        clienteComSencillo.mostrarCuaderno();
    }
    public void solicitarMantenimiento(){
        clienteGarantia = new Mantenimiento.TipoMantenimiento.ClientePasajero.ClienteGarantia();
        clienteGarantia.gestionarSolicitud();
    }
    public void verListaAccesorios(){
        clientePartes = new Mantenimiento.ComprarRepuesto.ConsultorRepuestos.ConsultorListaRepuestos();
        clientePartes.obtenerListaRepuesto();
    }
    public void RegistrarCliente(){
        registroCliente = new registrocliente.RegistrarCliente();
        Scanner sc = new Scanner(System.in);
        ClienteIngreso cliente = new ClienteIngreso();
        System.out.println("Ingrese nombre");
        cliente.setNombre(sc.next());
        System.out.println("Ingrese numero doc");
        cliente.setNumeroDoc(sc.next());
        registroCliente.guardarInfoCliente(cliente);
    }
}
