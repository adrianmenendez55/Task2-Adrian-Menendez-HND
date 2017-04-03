package com.example.alumno1.task2_adrian_menendez_hnd.tests;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.ObjetosBean;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.PersonajesBean;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.TipsBean;

import java.util.ArrayList;

/**
 * Created by ALUMNOS on 10/03/2017.
 */

public class Modelo {
    public static ArrayList<PersonajesBean> getPersonajes(){
        ArrayList<PersonajesBean> personajes = new ArrayList<>();
        personajes.add(new PersonajesBean("http://adrianmenendez.esy.es/Android/nave1.jpeg", "Nave principal", "Nave que controlaremos, ligera y fácilmente manejable. Contiene misiles."));
        personajes.add(new PersonajesBean("http://adrianmenendez.esy.es/Android/nave2.png", "Nave enemiga", "Naves enemigas fáciles, no son demasiado resistentes. Armas no demasiado poderosas."));
        personajes.add(new PersonajesBean("http://adrianmenendez.esy.es/Android/nave3.png", "Nave final o boss", "Nave boss que habrá que derrotar para ganar el juego. La nave más difícil de derrotar. Misiles más dañinos y más resistentes"));

        return personajes;
    }

    public static ArrayList<ObjetosBean> getObjetos() {
        ArrayList<ObjetosBean> objetos = new ArrayList<>();
        objetos.add(new ObjetosBean("http://adrianmenendez.esy.es/Android/montana.jpg", "Montañas", "Montañas que habrá que sortear para avanzar por el mapa. Si te chocas con ellas, mueres."));
        objetos.add(new ObjetosBean("http://adrianmenendez.esy.es/Android/amanecer.jpg", "Amanecer", "Cielo del juego. Inspirado en los amanaceres en la montaña."));

        return objetos;
    }

    public static ArrayList<TipsBean> getTips(){
        ArrayList<TipsBean> tips = new ArrayList<>();

        tips.add(new TipsBean("Novedades", "Se espera una actualización próximamente"));
        tips.add(new TipsBean("Trucos", "Derriba a todos los enemigos antes de ir a por el boss"));

        return tips;

    }
}
