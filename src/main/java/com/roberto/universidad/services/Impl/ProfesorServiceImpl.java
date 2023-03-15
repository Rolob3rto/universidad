package com.roberto.universidad.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberto.universidad.model.Profesor;
import com.roberto.universidad.repositories.ProfesorRespository;
import com.roberto.universidad.services.ProfesorServices;

import java.util.Optional;

@Service
public class ProfesorServiceImpl implements ProfesorServices {

    @Autowired
    ProfesorRespository repository;

    @Override
    public List<Profesor> findAll() {
        return repository.findAll();
    }

    @Override
    public Profesor findById(String codigo) {
        Optional<Profesor> findById = repository.findById(codigo);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Profesor save(Profesor profesor) {
        return repository.save(profesor);
    }

    @Override
    public Profesor update(Profesor profesor) {
        Profesor findById = this.findById(profesor.getIdProfesor());
        if(findById != null){

            profesor.setIdProfesor(findById.getIdProfesor());

            return repository.save(profesor);
            
        }
        return null;
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
    
}
