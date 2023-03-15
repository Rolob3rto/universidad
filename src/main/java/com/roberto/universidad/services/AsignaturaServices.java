package com.roberto.universidad.services;


import java.util.List;

import com.roberto.universidad.model.Asignatura;



public interface AsignaturaServices {
    public List<Asignatura> findAll();

    public Asignatura findById(String id);

    public Asignatura save(Asignatura asignatura);

    public Asignatura update(Asignatura asignatura);

    public void deleteById(String id);
}
