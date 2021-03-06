package com.example.apphack;

import java.io.Serializable;

public class Peticion implements Serializable {

    private String titulo,descripcion;
    private int num_personas;
    private float dinero_pRecaudar;
    private float dinero_tRecaudar;

    public Peticion(String titulo, String descripcion, int num_personas, float dinero_pRecaudar, float dinero_tRecaudar) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.num_personas = num_personas;
        this.dinero_pRecaudar = dinero_pRecaudar;
        this.dinero_tRecaudar = dinero_tRecaudar;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    public float getDinero_pRecaudar() {
        return dinero_pRecaudar;
    }

    public float getDinero_tRecaudar() {
        return dinero_tRecaudar;
    }

    public void setDinero_pRecaudar(float dinero_pRecaudar) {
        this.dinero_pRecaudar = dinero_pRecaudar;
    }

    public void setDinero_tRecaudar(float dinero_tRecaudar) {
        this.dinero_tRecaudar = dinero_tRecaudar;
    }
}
