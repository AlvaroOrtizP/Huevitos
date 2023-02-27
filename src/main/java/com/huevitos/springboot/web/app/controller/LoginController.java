package com.huevitos.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huevitos.springboot.web.app.entity.User;

@RestController
@RequestMapping("login")
public class LoginController {

	@GetMapping
	public List<User> listUsers(){
		List<User> result = new ArrayList<>();
		result.add(new User(1, "Paco", "email", "pass"));
		//https://www.youtube.com/watch?v=_p-Odh3MZJc
		return result;
	}
}
