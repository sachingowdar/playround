package com.playround.sayhello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playround.sayhello.model.Person;
import com.playround.sayhello.repo.PersonRespository;

@Service
public class PlayroundService {
	
	@Autowired
	public PersonRespository respository;
	
	public List<Person> getAllPeople(){
		return respository.findAll();
	}

}
