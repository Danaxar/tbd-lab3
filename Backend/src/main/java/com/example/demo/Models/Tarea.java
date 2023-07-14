package com.example.demo.Models;

public class Tarea {
    private Integer id_tarea;
    private String nombre;
    private String descripcion;
    private String region;
    // FK
    private Integer id_estado;

    private Integer id_emergencia;

    // Getters
    public Integer getId_tarea() {
        return id_tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRegion() {
        return region;
    }



    public Integer getId_estado() {
        return id_estado;
    }

    public Integer getId_emergencia() {
        return id_emergencia;
    }

    // Setters

    public void setId_tarea(Integer id_tarea) {
        this.id_tarea = id_tarea;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    public void setId_estado(Integer id_estado) {
        this.id_estado = id_estado;
    }

    public void setId_emergencia(Integer id_emergencia) {
        this.id_emergencia = id_emergencia;
    }

}
