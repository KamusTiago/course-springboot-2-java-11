package com.kamustiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamustiago.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
