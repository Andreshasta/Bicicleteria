/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.ComprarRepuesto.ObtenerListaRepuestos.base;

import Mantenimiento.ComprarRepuesto.ConsultorRepuestos.Repuesto;
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
public class ConsultorBaseRepuestos {
    private final String nombreArchivo = "listarepuestos.dat";
    
    public void guardarArchivo(Repuesto dato) {
        //System.out.println("Ingresó a: " + this.getClass().getName() + ".guardarArchivo()");
        ArrayList<Repuesto> datos = this.leerArchivo();
        datos.add(dato);
        BufferedOutputStream bos = null;
        //String nombreArchivo = "listarepuestos.dat";
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

    public ArrayList<Repuesto> leerArchivo() {
        //System.out.println("Ingresó a: " + this.getClass().getName() + ".leerArchivo()");
        ArrayList<Repuesto> datos = new ArrayList<>();
        BufferedInputStream bis = null;
        ObjectInputStream ois = null;
        //String nombreArchivo = "listarepuestos.dat";
        System.out.println(this.getClass().getName() + " nombreArchivo: " + nombreArchivo);
        try {
            bis = new BufferedInputStream(new FileInputStream(nombreArchivo));
            ois = new ObjectInputStream(bis);
            // Objeto de la clase que se quiere obtener.
            Repuesto p = (Repuesto) ois.readObject();
            while (true) {
                datos.add(p);
                // Objeto de la clase que se quiere obtener.
                p = (Repuesto) ois.readObject();
            }
        } catch (EOFException ex) {
            System.out.println("Fin del archivo");
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

}
