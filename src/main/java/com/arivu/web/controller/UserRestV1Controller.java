package com.arivu.web.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.arivu.entity.User;
import com.arivu.service.IUserService;

@RestController
@RequestMapping("rest/v1/users")
public class UserRestV1Controller {

	@Autowired
	private IUserService userService;
	
	@GetMapping()
    public ResponseEntity<List<User>> getUsers(){    	
    	return ResponseEntity.ok(userService.findAll());
    }
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<Optional<User>> getUser(@PathVariable("id") ObjectId id){    	
    	return ResponseEntity.ok(userService.findById(id));
	}
	
	@PostMapping()
    public ResponseEntity<User> addUser(@Valid @RequestBody User user){
		user.setId(ObjectId.get());
		return ResponseEntity.ok(userService.addUser(user));
	}
	
	@PutMapping(value = "/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") ObjectId id, @Valid @RequestBody User user){
		user.setId(id);
		return ResponseEntity.ok(userService.updateUser(user));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") ObjectId id) {
		this.userService.deleteById(id);
	}
}