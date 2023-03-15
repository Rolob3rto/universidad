package com.roberto.universidad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.roberto.universidad.model.Profesor;

@Repository
public interface ProfesorRespository extends JpaRepository<Profesor, String>{
    
}
