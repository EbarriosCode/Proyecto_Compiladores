package com.code.ebarrios.kakchilingo.Models;

/**
 * Created by Ebarrios on 05/06/2017.
 */

public class Opciones {
    private int imagen;
    private String opcion;

    public Opciones(int imagen, String opcion) {
        this.imagen = imagen;
        this.opcion = opcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
}
