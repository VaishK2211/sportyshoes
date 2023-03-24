package com.springboot.sportyshoes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.sportyshoes.Repository.UserRepository;
import com.springboot.sportyshoes.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//create user API
	public int createAccount(User user)
	{
		User u1 = userRepository.save(user);
		return u1.getUserId();
		
	}
}
