package com.mihuerto.model;

import java.time.LocalDate;

public class Planta {

    private int idPlanta;
    private int idSurco;                    // Ubicación de la planta
    private String especiePlanta;
    private EstadoPlanta estado;
    private boolean enferma;
    private LocalDate fechaPlantacion;
    private LocalDate fechaUltimoRiego;
    private LocalDate fechaEstimadaCosecha;
    private String observaciones;

    public Planta(int idPlanta, int idSurco, String especiePlanta, EstadoPlanta estado, boolean enferma, LocalDate fechaPlantacion, LocalDate fechaUltimoRiego, LocalDate fechaEstimadaCosecha, String observaciones) {
        this.idPlanta = idPlanta;
        this.idSurco = idSurco;
        this.especiePlanta = especiePlanta;
        this.estado = estado;
        this.enferma = enferma;
        this.fechaPlantacion = fechaPlantacion;
        this.fechaUltimoRiego = fechaUltimoRiego;
        this.fechaEstimadaCosecha = fechaEstimadaCosecha;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Planta{" +
                "idPlanta=" + idPlanta +
                ", idSurco=" + idSurco +
                ", especiePlanta='" + especiePlanta + '\'' +
                ", estado=" + estado +
                ", enferma=" + enferma +
                ", fechaPlantacion=" + fechaPlantacion +
                ", fechaUltimoRiego=" + fechaUltimoRiego +
                ", fechaEstimadaCosecha=" + fechaEstimadaCosecha +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
