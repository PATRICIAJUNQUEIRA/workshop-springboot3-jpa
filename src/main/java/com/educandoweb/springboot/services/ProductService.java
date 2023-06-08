package com.educandoweb.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.springboot.entities.Product;
import com.educandoweb.springboot.repositories.ProductRepository;

@Service 
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findId(Long id) {
		Optional<Product> obj=repository.findById(id);
		return obj.get();
	}
}