package com.photoapp.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountManagement {

	@GetMapping
	public String status() {
		return "Account started updated again";
	}
	
}
