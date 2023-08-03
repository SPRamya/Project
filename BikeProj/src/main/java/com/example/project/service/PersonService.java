package com.example.project.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Person;
import com.example.project.repository.PersonRepository;



@Service
public class PersonService {
	@Autowired
	PersonRepository prepo;
	public List<Person> getPerson()
	{
		return prepo.findAll();
	}
	public Person postPerson(Person p)
	{
		return prepo.save(p);
	}

}