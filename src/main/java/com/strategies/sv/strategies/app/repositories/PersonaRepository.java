package com.strategies.sv.strategies.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.strategies.sv.strategies.app.entities.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Integer>{

	
}
