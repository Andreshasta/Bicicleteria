package manejoarchivos.entradapkg.implementacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author AndresMauricio
 */
import manejoarchivos.entradapkg.especificacion.InterfaceEntrada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo implements InterfaceEntrada {

    @Override
    public String leer() {
        String entradaFichero=null;
        try {
            FileReader entrada = new FileReader("registro.txt");
            BufferedReader leyendo = new BufferedReader(entrada);
            entradaFichero = leyendo.readLine();
        } catch (IOException e) {
            System.out.println("no se ha encontrado el archivo");
        }
        return entradaFichero;
    }
}
