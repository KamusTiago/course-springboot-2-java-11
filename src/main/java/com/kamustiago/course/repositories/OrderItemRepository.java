package com.kamustiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamustiago.course.entities.OrderItem;

//não precisa colocar @repository pq ela ja esta herdando do jparepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
