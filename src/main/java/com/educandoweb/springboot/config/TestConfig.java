package com.educandoweb.springboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.springboot.entities.User;
import com.educandoweb.springboot.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TUDO que colocar aqui vai ser executado quando a aplicação for iniciada
		
		User u1 = new User(null, "Patricia", "Patricia@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Luiz Fernando", "Luiz.Fernando@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
