package com.educandoweb.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springboot.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

