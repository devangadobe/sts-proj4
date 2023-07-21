package com.appsdev.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {
	
	@GetMapping
	public String getUsers() {
		return "get users";
	}
	
	@PostMapping
	public String createUser() {
		return "create users";
	}
	
	@PutMapping
	public String updateUser() {
		return null;
	}
	
	@DeleteMapping
	public String deleteUser() {
		return null;
	}

}
