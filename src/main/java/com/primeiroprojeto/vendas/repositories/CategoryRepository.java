package com.primeiroprojeto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.vendas.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}



