package com.rms.rms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rms.rms.model.User;
import com.rms.rms.repository.UserRepository;
@Service
public class UserService {
	
	
	@Autowired
	private  UserRepository userRepository;
	
	public User saveUser(User user) {
	return userRepository.save(user);
		
	}
	
	public User updateUser(User user) {
		User existingUser=userRepository.findById(user.getId()).orElse(null);
		existingUser.setUser_name(user.getUser_name());
		existingUser.setPassword(user.getPassword());
		existingUser.setStatus(user.getStatus());
		existingUser.setCreated_timestamp(user.getCreated_timestamp());
		return userRepository.save(existingUser);
	}
	
	public List<User> findUserByName(String user_name){
        return userRepository.findByName(user_name);
    }

}
