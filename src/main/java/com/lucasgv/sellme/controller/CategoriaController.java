package com.lucasgv.sellme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categoria")
public class CategoriaController {

    @GetMapping
    public String listar(){
        return "REST funcionando!";
    }
}
