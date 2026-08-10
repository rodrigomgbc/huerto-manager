package com.mihuerto.model;

import java.time.LocalDate;

public class Huerto {
    // Atributos del huerto
    private int idHuerto;
    private int tamanio;     // m^2
    private int numSurcos;
    private int numCultivos;
    private Ubicacion ubicacion;
    private String propietario;
    private LocalDate fechaCreacion;

    // Constructor
    public Huerto(int idHuerto, int tamanio, int numSurcos, int numCultivos, Ubicacion ubicacion, String propietario, LocalDate fechaCreacion) {
        this.idHuerto = idHuerto;
        this.tamanio = tamanio;
        this.numSurcos = numSurcos;
        this.numCultivos = numCultivos;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
        this.fechaCreacion = fechaCreacion;
    }

    // toString()
    @Override
    public String toString() {
        return "Huerto{" +
                "idHuerto=" + idHuerto +
                ", tamanio=" + tamanio +
                ", numSurcos=" + numSurcos +
                ", numCultivos=" + numCultivos +
                ", ubicacion=" + ubicacion +
                ", propietario='" + propietario + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}
