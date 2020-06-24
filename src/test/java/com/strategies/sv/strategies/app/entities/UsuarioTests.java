package com.strategies.sv.strategies.app.entities;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.strategies.sv.strategies.app.repositories.UsuarioRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UsuarioTests {

	@Autowired
	private UsuarioRepository repo;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	@Test
	public void createUsuarioConUsernameYClaveCorrecta() {
		Usuario u = new Usuario();
		u.setClave(encoder.encode("1234"));
		//Hacemos un numero random para el usuario, ya que el usuario es unico en la base de datos
		Random ran = new Random();
		int x = ran.nextInt(6) + 5;
		u.setNombreUsuario("Juanito"+x);
		
		Usuario retorno = repo.save(u);
		
		assertTrue(retorno.getClave().equalsIgnoreCase(u.getClave()));
	}
	
	@Test
	public void loginTestCorrectPassword() {
		boolean result = repo.login("Luis51", "1234");
		System.out.println("Resultado "+ result);
		assertTrue(result);
	}
	
	@Test
	public void loginTestIncorrectPassword() {
		boolean result = repo.login("Luis51", "12345");
		System.out.println("Resultado "+ result);
		assertFalse(result);
	}
	
	
}
