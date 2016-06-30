/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal.comando;

import MenuPrincipal.Empresa;

/**
 *
 * @author Edwin
 */
public class SeleccionarBiciAlquilar implements Comando {
    @Override
    public void ejecutar(){
        Empresa emp = Empresa.getInstancia();
        emp.seleccionarBiciAlquilar();
    }
}
