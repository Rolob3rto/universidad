package com.roberto.universidad.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberto.universidad.model.Asignatura;
import com.roberto.universidad.repositories.AsignaturaRepository;
import com.roberto.universidad.services.AsignaturaServices;

import java.util.Optional;

@Service
public class AsignaturaServiceImpl implements AsignaturaServices {

    @Autowired
    AsignaturaRepository repository;

    @Override
    public List<Asignatura> findAll() {
        return repository.findAll();
    }

    @Override
    public Asignatura findById(String codigo) {
        Optional<Asignatura> findById = repository.findById(codigo);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return repository.save(asignatura);
    }

    @Override
    public Asignatura update(Asignatura asignatura) {
        Asignatura findById = this.findById(asignatura.getIdAsignatura());
        if(findById != null){

            asignatura.setIdAsignatura(findById.getIdAsignatura());

            return repository.save(asignatura);
            
        }
        return null;
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
