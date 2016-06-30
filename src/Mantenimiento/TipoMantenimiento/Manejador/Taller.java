/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimiento.TipoMantenimiento.Manejador;

import Mantenimiento.TipoMantenimiento.ManejadorConcreto.CrossProfesional;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.Playeras;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.Adultos26;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.Jovenes24;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.Ninos20;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.TodoterrenoCompJunior;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.TodoterrenoCompAdultos;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.Ninos16;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.SemicarreraAdulto;
import Mantenimiento.TipoMantenimiento.ManejadorConcreto.SemicarreraJunior;

/**
 *
 * @author Andres
 */
public class Taller implements Categoria {

    private Categoria km;

    @Override
    public void setSiguiente(Categoria categoria) {
        km = categoria;
    }

    @Override
    public Categoria getSiguiente() {
        return km;
    }

    @Override
    public void categoriaTiquet(double categoria) {
        Ninos16 biciNino16 = new Ninos16();
        this.setSiguiente(biciNino16);

        Ninos20 biciNino20 = new Ninos20();
        biciNino16.setSiguiente(biciNino20);

        Jovenes24 biciNino24 = new Jovenes24();
        biciNino20.setSiguiente(biciNino24);

        Adultos26 adulto26 = new Adultos26();
        biciNino24.setSiguiente(adulto26);

        Playeras playera = new Playeras();
        adulto26.setSiguiente(playera);

        CrossProfesional cross = new CrossProfesional();
        playera.setSiguiente(cross);

        TodoterrenoCompJunior juniorTodoterreno = new TodoterrenoCompJunior();
        cross.setSiguiente(juniorTodoterreno);

        TodoterrenoCompAdultos adultoTodoterreno = new TodoterrenoCompAdultos();
        juniorTodoterreno.setSiguiente(adultoTodoterreno);
        
        SemicarreraJunior juniorSemi = new SemicarreraJunior();
        adultoTodoterreno.setSiguiente(juniorSemi);
        
         SemicarreraAdulto adultoSemi = new SemicarreraAdulto();
        juniorSemi.setSiguiente(adultoSemi);

        km.categoriaTiquet(categoria);

    }

}
