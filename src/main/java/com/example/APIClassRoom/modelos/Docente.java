package com.example.APIClassRoom.modelos;

public class Docente {
    private Integer idDocente;
    private Integer idUsuario;
    private String especialidad;

    public Docente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Docente(Integer idDocente, Integer idUsuario, String especialidad) {
        this.idDocente = idDocente;
        this.idUsuario = idUsuario;
        this.especialidad = especialidad;
    }

    public Integer getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(Integer idDocente) {
        this.idDocente = idDocente;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
