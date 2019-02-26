package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Hello;

@RestController
public class HomeController {

	@PreAuthorize("isAuthenticated()")
	@RequestMapping("/")
	public ResponseEntity<Hello> homePage(){
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return new ResponseEntity<Hello>(new Hello("You are logged in as " + auth.getName()),HttpStatus.OK);
	}
}
