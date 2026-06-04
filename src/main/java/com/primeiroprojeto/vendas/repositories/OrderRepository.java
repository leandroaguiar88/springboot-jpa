package com.primeiroprojeto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.vendas.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}



