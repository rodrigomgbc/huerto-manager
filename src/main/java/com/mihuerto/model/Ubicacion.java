package com.mihuerto.model;

public class Ubicacion {

    private int id;
    private String poblacion;
    private String provincia;
    private double latitud;
    private double longitud;
    private double altitud;

    // Constructor
    public Ubicacion(int id, String poblacion, String provincia, double latitud, double longitud, double altitud) {
        this.id = id;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
    }

    // toString()
    @Override
    public String toString() {
        return "Ubicacion{" +
                "id=" + id +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", altitud=" + altitud +
                '}';
    }
}
