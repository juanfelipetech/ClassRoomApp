package com.example.APIClassRoom.modelos;

public class Materia {
    private Integer id;
    private String nombre;
    private Docente docente;

    public Materia() {
    }

    public Materia(Integer id, String nombre, Docente docente) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
