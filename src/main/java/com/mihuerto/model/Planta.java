package com.mihuerto.model;

import java.time.LocalDate;

public class Planta {

    private int id;
    private int idSurco;                    // Ubicación de la 
    private String especie;
    private EstadoPlanta estado;
    private boolean enferma;
    private LocalDate fechaPlantacion;
    private LocalDate fechaUltimoRiego;
    private LocalDate fechaEstimadaCosecha;
    private String observaciones;

    public Planta (int id, int idSurco, String especie, EstadoPlanta estado, boolean enferma, LocalDate fechaPlantacion, LocalDate fechaUltimoRiego, LocalDate fechaEstimadaCosecha, String observaciones) {
        this.id = id;
        this.idSurco = idSurco;
        this.especie = especie;
        this.estado = estado;
        this.enferma = enferma;
        this.fechaPlantacion = fechaPlantacion;
        this.fechaUltimoRiego = fechaUltimoRiego;
        this.fechaEstimadaCosecha = fechaEstimadaCosecha;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", idSurco=" + idSurco +
                ", especie='" + especie + '\'' +
                ", estado=" + estado +
                ", enferma=" + enferma +
                ", fechacion=" + fechaPlantacion +
                ", fechaUltimoRiego=" + fechaUltimoRiego +
                ", fechaEstimadaCosecha=" + fechaEstimadaCosecha +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
