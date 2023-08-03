package com.example.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Person;
import com.example.project.service.PersonService;




@RestController
public class PersonController {

	@Autowired
	PersonService pservice;
	
	
	@GetMapping("/getPerson")
	public List<Person> findAll()
	{
		return pservice.getPerson();
	}
	
	@PostMapping("/postPerson")
	public Person addPerson(@RequestBody Person p)
	{
		return pservice.postPerson(p);
	}
}
