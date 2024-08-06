package com.carlos_henrique.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos_henrique.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
}
