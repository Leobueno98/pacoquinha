package com.senac.uc6.pacoquinha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PacoquinhaApplication {

	public static void main(String[] args) {
		var texto = "Eu sou a ";
		//char teste = 123;
		System.out.println(texto + "Leo");
		SpringApplication.run(PacoquinhaApplication.class, args);

	}

}

