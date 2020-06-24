package com.strategies.sv.strategies.app.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.strategies.sv.strategies.app.entities.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	Usuario findByNombreUsuario(String username);
	
	@Query(value = "SELECT testing(?, ?)", nativeQuery = true)
	boolean login(String username, String clave);
}
