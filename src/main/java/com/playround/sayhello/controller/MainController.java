package com.playround.sayhello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.playround.sayhello.model.Person;
import com.playround.sayhello.service.PlayroundService;

@RestController
public class MainController {
	
	@Autowired
	public PlayroundService service;

	@GetMapping(value = { "/" })
	public ResponseEntity<String> sayHello(@PathVariable(name = "name",required = false ) String name) {
		String statement = null;
		if (name == null)
			statement = "Hello!!";
		else
			statement = "Hello! " + name+ "...";
		return ResponseEntity.ok(statement);
	}
	
	@GetMapping(value = { "/sayhello", "/sayhello/{name}" })
	public ResponseEntity<String> sayHelloAgain(@PathVariable(name = "name",required = false ) String name) {
		String statement = null;
		if (name == null)
			statement = "Hello!!";
		else
			statement = "Hello! " + name+ "...";
		return ResponseEntity.ok(statement);
	}
	
	@GetMapping(value = {"/people"})
	public ResponseEntity<List<Person>> getAllPeople(){
		List<Person> people = service.getAllPeople();
		return ResponseEntity.ok(people);
	}

}
