package com.example.APIClassRoom.modelos;

import com.example.APIClassRoom.ayudas.Estado;

import java.time.LocalDate;

public class Asistencia {

    private Integer id;
    private LocalDate fecha;
    private Estado estado;

    public Asistencia() {
    }

    public Asistencia(Integer id, LocalDate fecha, Estado estado) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
