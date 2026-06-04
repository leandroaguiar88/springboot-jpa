package com.primeiroprojeto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.vendas.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}



