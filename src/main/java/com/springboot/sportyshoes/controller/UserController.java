package com.springboot.sportyshoes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.sportyshoes.model.User;
import com.springboot.sportyshoes.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping( "/user/create")
	
	public int createAccount(@RequestBody User user) {
		int userId = userService.createAccount(user);
		return userId;

		
	}
}
