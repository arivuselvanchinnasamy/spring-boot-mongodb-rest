package com.arivu.service.impl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arivu.entity.User;
import com.arivu.repository.IUserRepository;
import com.arivu.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public List<User> findByFirstName(String firstName) {
		return userRepository.findByFirstName(firstName);
	}

	@Override
	public List<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User addUser(User entity) {
		return userRepository.save(entity);
	}
	
	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> findById(ObjectId userId) {
		return userRepository.findById(userId);
	}

	@Override
	public void deleteById(ObjectId userId) {
		userRepository.deleteById(userId);		
	}

}
