package com.kamustiago.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamustiago.course.entities.User;
import com.kamustiago.course.repositories.UserRepository;

//Registrando a classe como componente do spring
@Service
public class UserService {
	// injeção de dependencia
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		java.util.Optional<User> obj = repository.findById(id);
		return obj.get();
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delet(Long id) {
		repository.deleteById(id);
	}

	// o getOne apenas prepara o obj para realizar uma operacao, ele nao traz
	// diretamente do banco
	public User update(Long id, User obj) {
		User entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}

}
