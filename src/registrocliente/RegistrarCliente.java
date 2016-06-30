/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocliente;

import manejoarchivos.entradasalida.Lee;
import manejoarchivos.entradasalida.Salida;

/**
 *
 * @author Edwin
 */
public class RegistrarCliente {
    public void guardarInfoCliente(ClienteIngreso cliente){
        System.out.println("guardando datos");
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getNumeroDoc());
        Salida sale = new Salida();
        sale.setDato(cliente.getNombre()+";"+cliente.getNumeroDoc()+";");
        sale.salidaValor(2);
    }
    public boolean validarListaClientes(String numeroDoc){
        boolean resultado=false;
        String datoGuardado;
        Lee entra = new Lee();
        datoGuardado=entra.leerValor(2);
        String nombre = datoGuardado.substring(0, datoGuardado.indexOf(";") );
        String numDoc = datoGuardado.substring(datoGuardado.indexOf(";")+1, datoGuardado.length()-1);
        if (numDoc.equalsIgnoreCase(numeroDoc)){
            resultado = true;
        }
        return resultado;
    }
}
