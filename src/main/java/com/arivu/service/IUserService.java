package com.arivu.service;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;

import com.arivu.entity.User;

public interface IUserService {

	List<User> findByFirstName(String firstName);
    
	List<User> findByEmail(String email);
	
	List<User> findAll();
	
	User addUser(User entity);
	
	User updateUser(User user);
	
	Optional<User> findById(ObjectId userId);

	void deleteById(ObjectId id);

	
}
