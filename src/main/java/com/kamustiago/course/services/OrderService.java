package com.kamustiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamustiago.course.entities.Order;
import com.kamustiago.course.repositories.OrderRepository;

//Registrando a classe como componente do spring
@Service
public class OrderService {
	//injeção de dependencia
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		java.util.Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
