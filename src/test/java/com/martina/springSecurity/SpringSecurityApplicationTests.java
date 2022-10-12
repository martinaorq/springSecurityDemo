package com.martina.springSecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringSecurityApplicationTests {

	@Test
	void contextLoads() {
		String contrasena= "contrasenaDificil";
		PasswordEncoder encoder= PasswordEncoderFactories.createDelegatingPasswordEncoder();
		String contrasenaSegura= encoder.encode(contrasena);
		assertTrue(encoder.matches(contrasena,contrasenaSegura));
		System.out.println(contrasena);
		System.out.println(contrasenaSegura);
	}

}
