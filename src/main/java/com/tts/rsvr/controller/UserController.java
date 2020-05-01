package com.tts.rsvr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.rsvr.service.UserServiceImpl;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

	// Get all users
	// Get user by id
	// Create user
	// Update user
	// Delete a user
	
}
