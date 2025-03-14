package com.example.APIClassRoom.modelos;

import com.example.APIClassRoom.ayudas.TipoUsuario;

public class Usuario {

    private Integer id;

    private String nombre;

    private String conrreoElectronico;

    private String telefono;

    private TipoUsuario tipoUsuario;

    public Usuario() {
    }

    public Usuario(Integer id, String nombre, String conrreoElectronico, String telefono, TipoUsuario tipoUsuario) {
        this.id = id;
        this.nombre = nombre;
        this.conrreoElectronico = conrreoElectronico;
        this.telefono = telefono;
        this.tipoUsuario = tipoUsuario;
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

    public String getConrreoElectronico() {
        return conrreoElectronico;
    }

    public void setConrreoElectronico(String conrreoElectronico) {
        this.conrreoElectronico = conrreoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}

