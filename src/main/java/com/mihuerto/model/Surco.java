package com.mihuerto.model;

public class Surco {
    private int id;
    private int idHuerto;
    private int numero;
    private int fila;
    private int columna;
    private int largo;
    private int ancho;

    public Surco(int id, int idHuerto, int numero, int fila, int columna, int largo, int ancho) {
        this.id = id;
        this.idHuerto = idHuerto;
        this.numero = numero;
        this.fila = fila;
        this.columna = columna;
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Surco{" +
                "id=" + id +
                ", idHuerto=" + idHuerto +
                ", numero=" + numero +
                ", fila=" + fila +
                ", columna=" + columna +
                ", largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
