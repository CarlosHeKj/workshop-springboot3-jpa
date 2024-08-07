package com.carlos_henrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos_henrique.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
