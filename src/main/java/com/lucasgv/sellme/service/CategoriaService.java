package com.lucasgv.sellme.service;

import com.lucasgv.sellme.domain.dao.CategoriaDAO;
import com.lucasgv.sellme.domain.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaDAO categoriaDAO;

    public Categoria findById(Long id){

        return categoriaDAO.findById(id).orElse(null);

    }
}
