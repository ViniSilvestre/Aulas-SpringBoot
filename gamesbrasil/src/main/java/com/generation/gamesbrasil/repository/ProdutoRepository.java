package com.generation.gamesbrasil.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.gamesbrasil.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
	public List<ProdutoModel> findAllByTituloContainingIgnoreCase (String titulo);
}
	
