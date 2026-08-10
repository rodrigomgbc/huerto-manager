package com.mihuerto.model;

public class Ubicacion {

    private String poblacion;
    private String provincia;
    private double latitud;
    private double longitud;
    private double altura;

    // Constructor
    public Ubicacion(String poblacion, String provincia, double latitud, double longitud, double altura) {
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altura = altura;
    }

    // toString()
    @Override
    public String toString() {
        return "Ubicacion{" +
                "poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", altura=" + altura +
                '}';
    }
}
