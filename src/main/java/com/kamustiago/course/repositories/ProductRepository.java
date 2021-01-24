package com.kamustiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamustiago.course.entities.Product;

//não precisa colocar @repository pq ela ja esta herdando do jparepository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
