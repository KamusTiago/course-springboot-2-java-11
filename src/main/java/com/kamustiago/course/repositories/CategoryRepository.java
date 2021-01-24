package com.kamustiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamustiago.course.entities.Category;

//não precisa colocar @repository pq ela ja esta herdando do jparepository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
