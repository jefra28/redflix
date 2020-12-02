package com.example.redflix.modelos;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "id_username")
    String idUsername;
    String nombre;
    String apellido;
    String email;
    String celular;
    String password;
    String fecha_nacimiento;


    public Usuario(String idUsername, String nombre, String apellido, String email, String celular, String password, String fecha) {
        this.idUsername = idUsername;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.password = password;
        this.fecha_nacimiento = fecha;
    }

    public Usuario() {
    }

    public String getIdUsername() {
        return idUsername;
    }

    public void setIdUsername(String idUsername) {
        this.idUsername = idUsername;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}

