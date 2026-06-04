package com.primeiroprojeto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.vendas.entities.OrderItem;
import com.primeiroprojeto.vendas.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}



