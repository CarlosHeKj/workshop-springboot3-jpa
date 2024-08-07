package com.carlos_henrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos_henrique.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	

}
