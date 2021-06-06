package com.validation.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.validation.model.User;

@RestController
public class UserController {

	@PostMapping("/save")
	public String saveUser(@Valid @RequestBody User user) {
		return "success";
	}
}
