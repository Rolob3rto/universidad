package com.roberto.universidad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Telefono {
    
    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("idProfesor")
    private int idProfesor;

    @Column(length = 9)
    private int telefono;

    

    public Telefono() {
    }

    public Telefono(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public Telefono(int idProfesor, int telefono) {
        this.idProfesor = idProfesor;
        this.telefono = telefono;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idProfesor;
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
        Telefono other = (Telefono) obj;
        if (idProfesor != other.idProfesor)
            return false;
        return true;
    }

    

    
}
