package com.amdocs.fastfix.springserverapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestController {
	
	@GetMapping("/welcome")
	public String getEmployeeByID() {
		return "Welcome to boot";
	}
}