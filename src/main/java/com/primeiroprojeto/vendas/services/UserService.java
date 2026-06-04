package com.primeiroprojeto.vendas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroprojeto.vendas.entities.User;
import com.primeiroprojeto.vendas.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	
		
	}
	
	
}
