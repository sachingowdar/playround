package com.playround.sayhello.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

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

}
