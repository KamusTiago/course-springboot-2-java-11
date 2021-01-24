package com.kamustiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamustiago.course.entities.User;

//não precisa colocar @repository pq ela ja esta herdando do jparepository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
