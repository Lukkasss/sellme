package com.lucasgv.sellme;

import com.lucasgv.sellme.domain.dao.CategoriaDAO;
import com.lucasgv.sellme.domain.dao.ProdutoDAO;
import com.lucasgv.sellme.domain.entity.Categoria;
import com.lucasgv.sellme.domain.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SellmeApplication implements CommandLineRunner {

	@Autowired
	private CategoriaDAO categoriaDAO;

	@Autowired
	private ProdutoDAO produtoDAO;

	public static void main(String[] args) {

		SpringApplication.run(SellmeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria("Informática");
		Categoria cat2 = new Categoria("Escritório");

		Produto p1 = new Produto( "Computador", 2000.0);
		Produto p2 = new Produto( "Impressora", 800.0);
		Produto p3 = new Produto( "Computador", 80.0);

		cat1.getProdutoList().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutoList().add(p2);

		p1.getCategoriaList().add(cat1);
		p2.getCategoriaList().addAll(Arrays.asList(cat1, cat2));
		p3.getCategoriaList().add(cat1);


		categoriaDAO.saveAll(Arrays.asList(cat1, cat2));
		produtoDAO.saveAll(Arrays.asList(p1, p2, p3));
	}
}
