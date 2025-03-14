package com.example.APIClassRoom.modelos;

import java.time.LocalDate;

public class Inscripcion {
    private Integer id;
    private Estudiante estudiante;
    private Curso curso;
    private LocalDate fechaInscripcion;

    public Inscripcion() {
    }

    public Inscripcion(Integer id, Estudiante estudiante, Curso curso, LocalDate fechaInscripcion) {
        this.id = id;
        this.estudiante = estudiante;
        this.curso = curso;
        this.fechaInscripcion = fechaInscripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }
}
