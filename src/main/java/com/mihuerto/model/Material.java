package com.mihuerto.model;

import java.time.LocalDate;

public class Material {

    private int id;
    private String nombre;
    private String descripcion;
    private String fabricante;
    private int cantidad;
    private EstadoMaterial estado;
    private String tipo;
    private LocalDate fechaAdquisicion;

    public Material(int id, String nombre, String descripcion, String fabricante, int cantidad, EstadoMaterial estado, String tipo, LocalDate fechaAdquisicion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.cantidad = cantidad;
        this.estado = estado;
        this.tipo = tipo;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", cantidad=" + cantidad +
                ", estado=" + estado +
                ", tipo='" + tipo + '\'' +
                ", fechaAdquisicion=" + fechaAdquisicion +
                '}';
    }
}
