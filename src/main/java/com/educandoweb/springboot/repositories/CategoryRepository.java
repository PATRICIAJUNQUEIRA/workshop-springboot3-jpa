package com.educandoweb.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springboot.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

