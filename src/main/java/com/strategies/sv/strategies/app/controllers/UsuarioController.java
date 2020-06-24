package com.strategies.sv.strategies.app.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strategies.sv.strategies.app.entities.Usuario;
import com.strategies.sv.strategies.app.services.UsuarioService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api/strategies/usuario")
public class UsuarioController {

	
	@Autowired
	private UsuarioService service;
	
	@GetMapping("/login")
	public String login(){
		return "authenticated successfully";
	}
	
	@GetMapping
	public Iterable<Usuario> findAllUsuario(){
		
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Usuario> findByIdUsuario(@PathVariable("id") Integer id){
		return service.findById(id);
	}
	
	@PostMapping()
	public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario entity){
		return new ResponseEntity<Usuario>(service.create(entity), HttpStatus.CREATED );
	}
}
