package com.example.alumno1.task2_adrian_menendez_hnd.beans;

import java.io.Serializable;

// Clase Bean que guarda las características de los objetos

public class ObjetosBean implements Serializable {
    private String imagen;
    private String nombreObjeto;
    private String detalleObjeto;

    public ObjetosBean(String imagen, String nombreObjeto, String detalleObjeto) {
        this.imagen = imagen;
        this.nombreObjeto = nombreObjeto;
        this.detalleObjeto = detalleObjeto;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public String getDetalleObjeto() {
        return detalleObjeto;
    }

    public void setDetalleObjeto(String detalleObjeto) {
        this.detalleObjeto = detalleObjeto;
    }
}
