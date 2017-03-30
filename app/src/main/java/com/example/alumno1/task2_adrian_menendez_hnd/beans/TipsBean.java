package com.example.alumno1.task2_adrian_menendez_hnd.beans;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 14/03/2017.
 */

// Clase Bean que guarda las características de los tips

public class TipsBean implements Serializable{
    private String nombreTips;
    private String detalleTips;

    public TipsBean(String nombreTips, String detalleTips) {
        this.nombreTips = nombreTips;
        this.detalleTips = detalleTips;
    }

    public String getNombreTips() {
        return nombreTips;
    }

    public void setNombreTips(String nombreTips) {
        this.nombreTips = nombreTips;
    }

    public String getDetalleTips() {
        return detalleTips;
    }

    public void setDetalleTips(String detalleTips) {
        this.detalleTips = detalleTips;
    }
}
