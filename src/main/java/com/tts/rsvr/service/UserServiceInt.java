package com.tts.rsvr.service;

import java.util.List;

import com.tts.rsvr.model.User;

public interface UserServiceInt {
	
	List<User> findAll();

	User findUserById(Long id);

	User saveUser(User user);

	User updateUser(Long id, User user);

	void deleteUserById(Long id);

}
