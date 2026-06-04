package com.primeiroprojeto.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.vendas.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}



