package com.spring.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/api/username")
	public String getUserName() {
		return "권영따이";
	}
}
