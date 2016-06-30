/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class MenuAyuda implements Menu {

    ArrayList<InterfazUsuario> listaMenus;

    public MenuAyuda() {
    }

    public String desplegar() {
        registrarMenus(null);
        return "fin";
    }

    @Override
    public void registrarMenus(Menu elemento) {
        listaMenus.add(new ObtenerOpcion());
    }
}
