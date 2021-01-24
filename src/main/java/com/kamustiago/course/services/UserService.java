package com.kamustiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamustiago.course.entities.User;
import com.kamustiago.course.repositories.UserRepository;
import com.sun.el.stream.Optional;

//Registrando a classe como componente do spring
@Service
public class UserService {
	//injeção de dependencia
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		java.util.Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
