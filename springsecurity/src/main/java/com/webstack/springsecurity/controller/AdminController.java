package com.webstack.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	
	@GetMapping("/admin/list")
	public String list() {
		return "All Admins";
	}
	
}
