/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteprueba;

import entidades.Empresa;
import java.util.ArrayList;
import manejoarchivos.EntradaSalida;
import manejoarchivos.ManejoArchivo;

/**
 *
 * @author Edwin
 */
public class Cliente {

    public static void pruebaGuardandoEmpresa() {
        Empresa empresa = new Empresa();
        empresa.setNit("999.999.999");
        empresa.setNombre("El Universal");
        EntradaSalida manejoArchivo = new ManejoArchivo();
        if (!manejoArchivo.isGuardado(empresa)) {
            manejoArchivo.guardarArchivo(new Empresa(), empresa);
            System.out.println("ya es envió a guardar.");
        } else {
            System.out.println("No se guardó.");

        }

        ArrayList<Object> empresas = manejoArchivo.leerArchivo(new Empresa());
        for (int i = 0; i < empresas.size(); i++) {
            empresa = (Empresa) empresas.get(i);
            System.out.println("La empresa leída es: " + empresa.getNombre());
        }
    }

    public static void main(String[] args) {
        pruebaGuardandoEmpresa();
    }
}
