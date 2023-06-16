package com.example.demosprinbootexceptionhandler.controller;

import com.example.demosprinbootexceptionhandler.entity.User;
import com.example.demosprinbootexceptionhandler.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;



	// create user
	@PostMapping
	public User createUser(@Valid @RequestBody User user) {

		return this.userRepository.save(user);
	}}
