package com.roberto.universidad.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Asignatura {

    @Id
    @GeneratedValue

    private String idAsignatura;

    private int curso;

    private int cuatrimestre;

    private String nombre;

    private String caracter;

    private int creditos;

    private String coordinador;

    public Asignatura() {
    }

    public Asignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public Asignatura(String idAsignatura, int curso, int cuatrimestre, String nombre, String caracter, int creditos,
            String coordinador) {
        this.idAsignatura = idAsignatura;
        this.curso = curso;
        this.cuatrimestre = cuatrimestre;
        this.nombre = nombre;
        this.caracter = caracter;
        this.creditos = creditos;
        this.coordinador = coordinador;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCoordinador() {
        return coordinador;
    }

    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idAsignatura == null) ? 0 : idAsignatura.hashCode());
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
        Asignatura other = (Asignatura) obj;
        if (idAsignatura == null) {
            if (other.idAsignatura != null)
                return false;
        } else if (!idAsignatura.equals(other.idAsignatura))
            return false;
        return true;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

}
