package com.carlos_henrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos_henrique.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
	
}
