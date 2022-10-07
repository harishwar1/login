package com.rms.rms.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.rms.rms.model.User;

import com.rms.rms.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	
	
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	 @GetMapping("/{user_name}")
	    public List<User> findByName(@RequestParam(value="user_name") String user_name){
	        return service.findUserByName(user_name);
	    }

}
