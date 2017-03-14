package com.example.alumno1.task2_adrian_menendez_hnd.tests;

import com.example.alumno1.task2_adrian_menendez_hnd.R;
import com.example.alumno1.task2_adrian_menendez_hnd.beans.ObjetosBean;

import java.util.ArrayList;

public class ObjetosModelo {
    public static ArrayList<ObjetosBean> getObjetos() {
        ArrayList<ObjetosBean> objetos = new ArrayList<>();
        objetos.add(new ObjetosBean(R.drawable.camisa, "Objeto1", "DetalleObjeto1"));
        objetos.add(new ObjetosBean(R.drawable.camisa, "Objeto2", "DetalleObjeto2"));
        objetos.add(new ObjetosBean(R.drawable.camisa, "Objeto3", "DetalleObjeto3"));

        return objetos;
    }
}
