package com.carlos_henrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos_henrique.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
