package com.example.alumno1.task2_adrian_menendez_hnd.tests;

import com.example.alumno1.task2_adrian_menendez_hnd.beans.TipsBean;

import java.util.ArrayList;

public class TipsModelo {
    public static ArrayList<TipsBean> getTips(){
        ArrayList<TipsBean> tips = new ArrayList<>();

        tips.add(new TipsBean("Novedades", "Se espera una actualización próximamente"));
        tips.add(new TipsBean("Trucos", "Derriba a todos los enemigos antes de ir a por el boss"));

        return tips;

    }
}
