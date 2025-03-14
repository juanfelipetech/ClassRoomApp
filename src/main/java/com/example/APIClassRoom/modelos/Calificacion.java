package com.example.APIClassRoom.modelos;

import java.time.LocalDate;

public class Calificacion {

    private Integer idCalificacion ;
    private Estudiante estudiante;
    private Materia materia;
    private Double nota;
    private LocalDate fechaEvaluacion;

    public Calificacion() {
    }

    public Calificacion(Integer idCalificacion, Estudiante estudiante, Materia materia, Double nota, LocalDate fechaEvaluacion) {
        this.idCalificacion = idCalificacion;
        this.estudiante = estudiante;
        this.materia = materia;
        this.nota = nota;
        this.fechaEvaluacion = fechaEvaluacion;
    }

    public Integer getIdCalificacion() {
        return idCalificacion;
    }

    public void setIdCalificacion(Integer idCalificacion) {
        this.idCalificacion = idCalificacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public LocalDate getFechaEvaluacion() {
        return fechaEvaluacion;
    }

    public void setFechaEvaluacion(LocalDate fechaEvaluacion) {
        this.fechaEvaluacion = fechaEvaluacion;
    }
}
