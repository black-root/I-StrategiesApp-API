package com.strategies.sv.strategies.app.entities;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.strategies.sv.strategies.app.repositories.UsuarioRepository;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UsuarioTests {

	@Autowired
	private UsuarioRepository repo;
	
	
	@Test
	public void loginTestCorrectPassword() {
		boolean result = repo.login("Luis51", 1234);
		System.out.println("Resultado "+ result);
		assertTrue(result);
	}
	
	@Test
	public void loginTestIncorrectPassword() {
		boolean result = repo.login("Luis51", 12345);
		System.out.println("Resultado "+ result);
		assertFalse(result);
	}
	
	
}
