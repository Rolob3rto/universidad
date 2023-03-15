package com.roberto.universidad.services;

import java.util.List;

import com.roberto.universidad.model.Profesor;


public interface ProfesorServices {
    public List<Profesor> findAll();

    public Profesor findById(String id);

    public Profesor save(Profesor profesor);

    public Profesor update(Profesor profesor);

    public void deleteById(String id);
}
