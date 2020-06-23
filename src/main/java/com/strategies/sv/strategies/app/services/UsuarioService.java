package com.strategies.sv.strategies.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strategies.sv.strategies.app.entities.Usuario;
import com.strategies.sv.strategies.app.repositories.UsuarioRepository;

@Service
public class UsuarioService{

	@Autowired
	UsuarioRepository repo;

	public Iterable<Usuario> findAll() {
		return repo.findAll();	
	}

	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public Usuario create(Usuario entity) {
		// TODO Auto-generated method stub
		return repo.save(entity);
	}
	
}
