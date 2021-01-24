package com.kamustiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamustiago.course.entities.Category;
import com.kamustiago.course.repositories.CategoryRepository;

//Registrando a classe como componente do spring
@Service
public class CategoryService {
	//injeção de dependencia
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		java.util.Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
