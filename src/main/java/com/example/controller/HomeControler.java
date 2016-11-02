package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Hello;

@RestController
public class HomeControler {

	@RequestMapping("/")
	public ResponseEntity<Hello> homePage(){
		return new ResponseEntity<Hello>(new Hello("CINEMAPP"),HttpStatus.OK);
	}
}
