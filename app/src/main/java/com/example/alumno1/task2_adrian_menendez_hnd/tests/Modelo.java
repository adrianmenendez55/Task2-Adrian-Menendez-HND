package com.example.alumno1.task2_adrian_menendez_hnd.tests;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.PersonajesBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 10/03/2017.
 */

public class Modelo {
    public static ArrayList<PersonajesBean> getPersonajes(){
        ArrayList<PersonajesBean> personajes = new ArrayList<>();
        personajes.add(new PersonajesBean(R.drawable.nave1, "Nave principal", "Nave que controlaremos, ligera y fácilmente manejable. Contiene misiles."));
        personajes.add(new PersonajesBean(R.drawable.nave3, "Nave enemiga", "Naves enemigas que tendremos que destruir para combatir con el boss, no son demasiado resistentes. Armas no demasiado poderosas."));
        personajes.add(new PersonajesBean(R.drawable.nave2, "Nave final o boss", "Nave boss que habrá que derrotar para ganar el juego. La nave más difícil de derrotar. Misiles más dañinos y más resistentes"));

        return personajes;
    }
}
