package com.strategies.sv.strategies.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.strategies.sv.strategies.app.entities.Usuario;
import com.strategies.sv.strategies.app.repositories.UsuarioRepository;


@Service
public class UsuarioService implements UserDetailsService{

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

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = repo.findByNombreUsuario(username);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userdet = new User(usuario.getNombreUsuario(), usuario.getClave(), roles );
		
		return userdet;
	}
	
}
