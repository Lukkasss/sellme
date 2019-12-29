package com.lucasgv.sellme.controller;

import com.lucasgv.sellme.domain.entity.Categoria;
import com.lucasgv.sellme.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar(){

        Categoria cat1 = new Categoria(1L, "Informática");
        Categoria cat2 = new Categoria(2L, "Escritório");

        List<Categoria> listaCategoria = new ArrayList<>();
        listaCategoria.add(cat1);
        listaCategoria.add(cat2);

        return listaCategoria;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Long id){

        return ResponseEntity.ok().body(categoriaService.findById(id));

    }
}
