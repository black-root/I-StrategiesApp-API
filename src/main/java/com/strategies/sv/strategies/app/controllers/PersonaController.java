package com.strategies.sv.strategies.app.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.strategies.sv.strategies.app.entities.Persona;
import com.strategies.sv.strategies.app.services.PersonaService;

@CrossOrigin(origins = "*", allowedHeaders = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value = "/api/strategies/personas")
public class PersonaController {

	@Autowired
	public PersonaService service;
	
	@GetMapping
	public Iterable<Persona> findAll(){
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Persona> findById(@PathVariable("id") Integer id){
		return service.findByIdPersona(id);
	}
	
	@PostMapping
	public ResponseEntity<Persona> createPersona(@RequestBody Persona entity){
		return new ResponseEntity<Persona>(service.create(entity), HttpStatus.CREATED);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Persona> updatePersona(@PathVariable("id")Integer id, @RequestBody Persona entity){
		return new ResponseEntity<Persona>(service.update(id, entity), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Persona> deleteByIdPersona(@PathVariable("id") Integer id){
		service.deleteById(id);
		return new ResponseEntity<Persona>(HttpStatus.NO_CONTENT);
	}
	
}
