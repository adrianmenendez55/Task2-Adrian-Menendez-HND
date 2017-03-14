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
        personajes.add(new PersonajesBean(R.drawable.camisa, "Nave principal", "Nave que controlaremos"));
        personajes.add(new PersonajesBean(R.drawable.camisa, "Nave enemiga", "Naves enemigas que tendremos que destruir para combatir con el boss"));
        personajes.add(new PersonajesBean(R.drawable.camisa, "Nave final o boss", "Nave boss que habrá que derrotar para ganar el juego"));

        return personajes;
    }
}
