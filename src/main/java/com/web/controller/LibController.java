package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.Library;
import com.web.service.serviceLib;

@RestController
@RequestMapping("/library")
public class LibController {
	@Autowired
	private serviceLib service;
	
	@PostMapping("/register")
	public ResponseEntity<?> post(@RequestBody Library library ){
		service.register(library);
		return ResponseEntity.ok(library);
		
	}
	@GetMapping("/get/{id}")
	public Library post(@PathVariable int id ){
		Library get=service.getone(id);
		return get;
		
	}

}
