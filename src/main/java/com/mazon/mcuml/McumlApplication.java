package com.mazon.mcuml;

import com.mazon.mcuml.domain.Categoria;
import com.mazon.mcuml.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class McumlApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(McumlApplication.class, args);
	}

	@Autowired
	private CategoriaRepository repository;


	@Override
	public void run(String... args) throws Exception {

		Categoria c1 = new Categoria(null, "Informatica");
		Categoria c2 = new Categoria(null, "Escritorio");

		repository.saveAll(Arrays.asList(c1, c2));
	}
}
