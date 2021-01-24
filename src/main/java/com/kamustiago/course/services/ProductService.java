package com.kamustiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamustiago.course.entities.Product;
import com.kamustiago.course.repositories.ProductRepository;

//Registrando a classe como componente do spring
@Service
public class ProductService {
	//injeção de dependencia
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		java.util.Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
