package com.arivu.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.arivu.entity.User;

public interface IUserRepository extends MongoRepository<User,ObjectId> {
    
	public List<User> findByFirstName(String firstName);
    
	public List<User> findByEmail(String email);

}
