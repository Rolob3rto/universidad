package com.roberto.universidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roberto.universidad.model.Asignatura;



@Repository
public interface AsignaturaRepository  extends JpaRepository<Asignatura, String>{
    
}
