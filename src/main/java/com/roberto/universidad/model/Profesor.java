package com.roberto.universidad.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Profesor {

    @Id
    @GeneratedValue
    private String idProfesor;

    private String NIF;

    private String nombre;

    private String apellido1;

    private String apellido2;

    private String email;

    private String direccion;

    private int codigoPostal;

    private String municipio;

    private String provincia;

    private String categoria;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "impartir")
    private List<Asignatura> asignaturas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Profesor() {
    }

    public Profesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }
   

    public Profesor(String idProfesor, String nIF, String nombre, String apellido1, String apellido2, String email,
            String direccion, int codigoPostal, String municipio, String provincia, String categoria,
            List<Asignatura> asignaturas) {
        this.idProfesor = idProfesor;
        NIF = nIF;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.municipio = municipio;
        this.provincia = provincia;
        this.categoria = categoria;
        this.asignaturas = asignaturas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idProfesor == null) ? 0 : idProfesor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Profesor other = (Profesor) obj;
        if (idProfesor == null) {
            if (other.idProfesor != null)
                return false;
        } else if (!idProfesor.equals(other.idProfesor))
            return false;
        return true;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String nIF) {
        NIF = nIF;
    }

}
