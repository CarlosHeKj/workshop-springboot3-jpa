package com.carlos_henrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos_henrique.course.entities.OrderItem;
import com.carlos_henrique.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

	
	
}
