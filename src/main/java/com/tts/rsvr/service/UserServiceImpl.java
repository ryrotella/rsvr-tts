package com.tts.rsvr.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.rsvr.model.User;
import com.tts.rsvr.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceInt {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User findUserById(Long id) {
		return userRepository.findUserById(id);
	}
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public User updateUser(Long id, User userFromForm) {
		User userFromDb = findUserById(id);
		
		//userFromDb.setName(userFromForm.getName());
		//userFromDb.setEmail(userFromForm.getEmail());
		
		BeanUtils.copyProperties(userFromForm, userFromDb);
		return userRepository.save(userFromDb);
	}
	
	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
		
	}
}
