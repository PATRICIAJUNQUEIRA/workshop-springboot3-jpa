package com.educandoweb.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.educandoweb.springboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}

