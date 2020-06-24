package com.strategies.sv.strategies.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strategies.sv.strategies.app.entities.Persona;
import com.strategies.sv.strategies.app.repositories.PersonaRepository;

@Service
public class PersonaService {

	@Autowired
	private PersonaRepository repo;

	public Iterable<Persona> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Optional<Persona> findByIdPersona(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public Persona create(Persona entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}

	public Persona update(Integer id, Persona entity) {
		// TODO Auto-generated method stub
		Persona personadb = repo.findById(id).get();
		if(personadb != null) {
			personadb.setPrimerNombre(entity.getPrimerNombre());
			personadb.setSegundoNombre(entity.getSegundoNombre());
			personadb.setPrimerApellido(entity.getPrimerApellido());
			personadb.setSegundoApellido(entity.getSegundoApellido());
			personadb.setSexo(entity.getSexo());
			personadb.setFechaNacimiento(entity.getFechaNacimiento());
			personadb.setInformacionAdicional(entity.getInformacionAdicional());
			
		}
		return repo.save(entity);
	}

	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
	

}
