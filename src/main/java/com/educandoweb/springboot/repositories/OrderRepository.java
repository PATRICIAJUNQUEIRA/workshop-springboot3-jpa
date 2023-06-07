package com.educandoweb.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.springboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}

