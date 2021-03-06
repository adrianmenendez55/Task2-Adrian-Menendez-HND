package com.example.alumno1.task2_adrian_menendez_hnd.beans;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 10/03/2017.
 */

// Clase Bean que guarda las características de los personajes

public class PersonajesBean implements Serializable {
    private String foto;
    private String descripcion;
    private String detalle;

    public PersonajesBean(String foto, String descripcion, String detalle) {
        this.foto = foto;
        this.descripcion = descripcion;
        this.detalle = detalle;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
}
