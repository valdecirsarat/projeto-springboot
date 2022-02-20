package com.example.projeto.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projeto.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User user = new User(1L, "Maria", "maria.sarat@gmail.com", "(41)988176666", "1097282");
		
		return ResponseEntity.ok().body(user);
		
		
	}

}
