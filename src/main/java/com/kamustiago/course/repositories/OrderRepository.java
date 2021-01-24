package com.kamustiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamustiago.course.entities.Order;

//não precisa colocar @repository pq ela ja esta herdando do jparepository
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
