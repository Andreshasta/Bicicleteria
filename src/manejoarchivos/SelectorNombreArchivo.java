/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import entidades.Cliente;
import entidades.Deuda;
import entidades.Empresa;
import entidades.Repuesto;
import entidades.TipoBicicleta;
import java.util.HashMap;

/**
 *
 * @author Edwin
 */
public class SelectorNombreArchivo {
    private static HashMap<String, String> tiposGuardado;

    public SelectorNombreArchivo() {
        SelectorNombreArchivo.tiposGuardado = new HashMap<>();
        definirTiposGuardado();
    }
    
    private void definirTiposGuardado(){
        tiposGuardado.put("EMPRESA", "empresa.dat");
        tiposGuardado.put("CLIENTE", "clientes.dat");
        tiposGuardado.put("TIPOBICICLETA", "tipobicicletas.dat");
        tiposGuardado.put("DEUDA", "deudas.dat");
        tiposGuardado.put("REPUESTO", "repuestos.dat");
    }
    private String consultarNombreArchivo(String tipo){
        //System.out.println("Ingresó a: "+this.getClass().getName()+".consultarNombreArchivo()");
        return tiposGuardado.get(tipo);
    }
    public String seleccionarNombreArchivo(Object tipoGuardado){
        //System.out.println("Ingresó a: "+this.getClass().getName()+".seleccionarNombreArchivo()");
        String nombreArchivo=null;
        //System.out.println("Clase recibida para descifrar: "+tipoGuardado.toString());
        if (tipoGuardado instanceof Empresa){
            //System.out.println("A manejar EMPRESA");
            nombreArchivo = consultarNombreArchivo("EMPRESA");
        }
        if (tipoGuardado instanceof Cliente){
            //System.out.println("A manejar CLIENTE");
            nombreArchivo = consultarNombreArchivo("CLIENTE");
        }
        if (tipoGuardado instanceof TipoBicicleta){
            //System.out.println("A manejar TIPOBICICLETA");
            nombreArchivo = consultarNombreArchivo("TIPOBICICLETA");
        }
        if (tipoGuardado instanceof Deuda){
            //System.out.println("A manejar DEUDA");
            nombreArchivo = consultarNombreArchivo("DEUDA");
        }
        if (tipoGuardado instanceof Repuesto){
            //System.out.println("A manejar REPUESTO");
            nombreArchivo = consultarNombreArchivo("REPUESTO");
        }
        //System.out.println("Saliendo de: "+this.getClass().getName()+".seleccionarNombreArchivo()");
        return nombreArchivo;
    }
}
