package com.generation.gamesbrasil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.gamesbrasil.model.CategoriaModel;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
	public List<CategoriaModel> findAllByGeneroContainingIgnoreCase (String genero);
}
