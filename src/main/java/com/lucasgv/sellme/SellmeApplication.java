package com.lucasgv.sellme;

import com.lucasgv.sellme.domain.dao.CategoriaDAO;
import com.lucasgv.sellme.domain.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SellmeApplication implements CommandLineRunner {

	@Autowired
	private CategoriaDAO categoriaDAO;

	public static void main(String[] args) {

		SpringApplication.run(SellmeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1L, "Informática");
		Categoria cat2 = new Categoria(2L, "Escritório");

		categoriaDAO.saveAll(Arrays.asList(cat1, cat2));
	}
}
