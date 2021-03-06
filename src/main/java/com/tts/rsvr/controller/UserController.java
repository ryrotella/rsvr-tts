package com.tts.rsvr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tts.rsvr.model.User;
import com.tts.rsvr.service.UserServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping()
	public List<User> getUsers(){
		return userServiceImpl.findAll();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable Long id) {
		return userServiceImpl.findUserById(id);
	}
	
	@PostMapping()
	public User saveUser(User user) {
		return userServiceImpl.saveUser(user);
	}
	
	//@RequestBody 
	
	@PutMapping("/{id}")
	public User putUser(@PathVariable Long id, 
							 User user) {
		return userServiceImpl.updateUser(id, user);
	}
	//@RequestBody 
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userServiceImpl.deleteUserById(id);
	}

	// Get all users
	// Get user by id
	// Create user
	// Update user
	// Delete a user
	
}
