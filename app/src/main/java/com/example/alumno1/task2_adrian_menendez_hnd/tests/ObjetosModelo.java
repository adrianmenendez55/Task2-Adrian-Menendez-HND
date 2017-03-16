package com.example.alumno1.task2_adrian_menendez_hnd.tests;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.ObjetosBean;

import java.util.ArrayList;

public class ObjetosModelo {
    public static ArrayList<ObjetosBean> getObjetos() {
        ArrayList<ObjetosBean> objetos = new ArrayList<>();
        objetos.add(new ObjetosBean(R.drawable.montana, "Montañas", "Montañas que habrá que sortear para avanzar por el mapa. Si te chocas con ellas, mueres."));
        objetos.add(new ObjetosBean(R.drawable.amanecer, "Amanecer", "Cielo del juego. Inspirado en los amanaceres en la montaña."));

        return objetos;
    }
}
