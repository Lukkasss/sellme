package com.lucasgv.sellme.domain.dao;

import com.lucasgv.sellme.domain.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaDAO extends JpaRepository<Categoria, Long> {
}
