package com.example.demo.Models;


import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "emergencias")
public class Emergencia {
    private String id_emergencia;
    private String nombre;
    private String gravedad;
    private LocalDate fecha;
    private String estado;
    private String region;


    public String getIdEmergencia() {
        return id_emergencia;
    }

    public void setIdEmergencia(String idEmergencia) {
        this.id_emergencia = idEmergencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
