package com.example.demo3.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class Usuario implements Serializable {
    private Long id;
    private String email;
    private String plataforma;
    private float version;
    private boolean isAdmin;
    private Date fecha;

    public Usuario() {
    }

    public Usuario(String email, String plataforma, float version, boolean isAdmin, Date fecha) {
        this.email = email;
        this.plataforma = plataforma;
        this.version = version;
        this.isAdmin = isAdmin;
        this.fecha = fecha;
    }

    public Usuario(String email, String plataforma, float version, boolean isAdmin) {
        this.email = email;
        this.plataforma = plataforma;
        this.version = version;
        this.isAdmin = isAdmin;
    }
}
