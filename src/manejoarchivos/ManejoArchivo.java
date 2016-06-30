/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class ManejoArchivo implements EntradaSalida {

    private SelectorNombreArchivo selectorArchivo;

    public ManejoArchivo() {
        selectorArchivo = new SelectorNombreArchivo();
    }

    @Override
    public void guardarArchivo(Object tipoArchivo, Object dato) {
        //System.out.println("Ingresó a: " + this.getClass().getName() + ".guardarArchivo()");
        ArrayList<Object> datos = this.leerArchivo(tipoArchivo);
        datos.add(dato);
        BufferedOutputStream bos = null;
        String nombreArchivo = selectorArchivo.seleccionarNombreArchivo(tipoArchivo);
        try {
            bos = new BufferedOutputStream(new FileOutputStream(nombreArchivo));
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado.");
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(bos);
            if (datos != null) {
                if (!datos.isEmpty()) {
                    for (int i = 0; i < datos.size(); i++) {
                        oos.writeObject(datos.get(i));
                    }
                }
            }
            //EntradaDatos ed = new EntradaPantalla();
            //ed.mostrar("Archivo " + nombreArchivo + " guardado.");
        } catch (IOException ex) {
            System.out.println("Error 1 guardando el archivo");
        }
        try {
            oos.close();
            bos.close();
        } catch (NullPointerException npe) {
            System.out.println("Cerrando objetos no creados.");
        } catch (IOException ex) {
            System.out.println("Error cerrando los archivos");
        }
    }

    @Override
    public ArrayList<Object> leerArchivo(Object tipoArchivo) {
        //System.out.println("Ingresó a: " + this.getClass().getName() + ".leerArchivo()");
        ArrayList<Object> datos = new ArrayList<>();
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
        String nombreArchivo = selectorArchivo.seleccionarNombreArchivo(tipoArchivo);
        System.out.println(this.getClass().getName() + " nombreArchivo: " + nombreArchivo);
        try {
            bis = new BufferedInputStream(new FileInputStream(nombreArchivo));
            ois = new ObjectInputStream(bis);
            // Objeto de la clase que se quiere obtener.
            Object p = ois.readObject();
            while (true) {
                datos.add(p);
                // Objeto de la clase que se quiere obtener.
                p = ois.readObject();
            }
        } catch (EOFException ex) {
            System.out.println("Fin del archivo");
            /*try {
                ois.close();
                bis.close();
            } catch (IOException ex1) {
                System.out.println("Error cerrando el archivo");
            }*/
        } catch (FileNotFoundException fnfe) {
            System.out.println("No encontró el archivo.");
        } catch (IOException ex) {
            System.out.println("Error en entrada y salida.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada.");
        }
        try {
            ois.close();
            bis.close();
        } catch (IOException ex) {
            System.out.println("Error cerrando el archivo f2");
        } catch (NullPointerException npe) {
            System.out.println("Error cerrando el archivo f2 null");
        }
        return datos;
    }

    @Override
    public boolean isGuardado(Object dato) {
        //System.out.println("Ingresó a: " + this.getClass().getName() + ".isGuardado()");
        boolean resultado = false;
        ArrayList<Object> datos = leerArchivo(dato);
        for (int i = 0; i < datos.size(); i++) {
            if (datos.get(i).toString().equals(dato.toString())) {
                System.out.println("Son iguales");
                resultado = true;
                i = datos.size();
            }else{
                System.out.println("Son diferentes");
                System.out.println(dato.toString());
            }
        }
        return resultado;
    }
}
