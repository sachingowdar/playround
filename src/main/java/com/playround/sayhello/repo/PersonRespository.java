package com.playround.sayhello.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.playround.sayhello.model.Person;

public interface PersonRespository extends MongoRepository<Person, String>{

}
