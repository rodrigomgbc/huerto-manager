package com.mihuerto.model;

import java.time.LocalDate;

public class Cosecha {
    private int id;
    private LocalDate fechaRecogida;
    private int idPlanta;
    private int cantidad;
    private String unidad;
    private String tipo;

    public Cosecha(int id, LocalDate fechaRecogida, int idPlanta, int cantidad, String unidad, String tipo) {
        this.id = id;
        this.fechaRecogida = fechaRecogida;
        this.idPlanta = idPlanta;
        this.cantidad = cantidad;
        this.unidad = unidad;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cosecha{" +
                "id=" + id +
                ", fechaRecogida=" + fechaRecogida +
                ", idPlanta=" + idPlanta +
                ", cantidad=" + cantidad +
                ", unidad='" + unidad + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
