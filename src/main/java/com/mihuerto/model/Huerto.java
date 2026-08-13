package com.mihuerto.model;

import java.time.LocalDate;

public class Huerto {
    // Atributos del huerto
    private int id;
    private int tamanio;     // m^2
    private Ubicacion ubicacion;
    private String propietario;
    private LocalDate fechaCreacion;

    // Constructor
    public Huerto(int id, int tamanio, Ubicacion ubicacion, String propietario, LocalDate fechaCreacion) {
        this.id = id;
        this.tamanio = tamanio;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
        this.fechaCreacion = fechaCreacion;
    }

    // toString()
    @Override
    public String toString() {
        return "Huerto{" +
                "id=" + id +
                ", tamanio=" + tamanio +
                ", ubicacion=" + ubicacion +
                ", propietario='" + propietario + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
