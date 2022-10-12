package com.martina.springSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		String contrasena = "Uwu";
		PasswordEncoder codificador= PasswordEncoderFactories.createDelegatingPasswordEncoder();
		String contraCod= codificador.encode(contrasena);
		System.out.println(contraCod);
	}

}
