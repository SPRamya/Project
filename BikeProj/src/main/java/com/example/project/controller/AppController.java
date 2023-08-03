package com.example.project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.exception.AppNotFoundException;
import com.example.project.model.App;
import com.example.project.repository.AppRepo;

@RestController
@CrossOrigin("http://localhost:3000")
public class AppController{
	
	@Autowired
	private AppRepo sobj;
	@PostMapping("/apppost")
	App appuser(@RequestBody App appuser)
	{
		return sobj.save(appuser);
	}
	@GetMapping("/appget")
	List<App> getAllUser(){
		return sobj.findAll();
	}
	@GetMapping("/appost/{id}")
	App getAppById(@PathVariable int id)
	{
		return sobj.findById(id)
		.orElseThrow(()->new AppNotFoundException(id));
	}
	@PutMapping("/appput/{id}")
	App updateApp(@RequestBody App newApp,@PathVariable int id)
	{
		return sobj.findById(id)
				.map(app -> {
					app.setName(newApp.getName());
					app.setUsername(newApp.getUsername());
					app.setEmail(newApp.getEmail());
					app.setAddress(newApp.getAddress());
					app.setBrand(newApp.getBrand());
					app.setColour(newApp.getColour());
					app.setMileage(newApp.getMileage());
					app.setModel(newApp.getModel());
					app.setPhno(newApp.getPhno());
					app.setPrice(newApp.getPrice());
					return sobj.save(app);
			
		}).orElseThrow(()->new AppNotFoundException(id));
	}
	@DeleteMapping("/appdelete/{id}")
	String deleteApp(@PathVariable int id)
	{
		if(!sobj.existsById(id)) {
			throw new AppNotFoundException(id);
		}
		sobj.deleteById(id);
		return "App with id "+id+" has been delete success.";
	}
	
	
}