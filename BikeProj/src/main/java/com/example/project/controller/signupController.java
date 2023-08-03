package com.example.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.signup;
import com.example.project.service.signupService;
@RestController
@Service
public class signupController {
	@Autowired
	public signupService sserv;
	@PostMapping("/saveSign")
	public signup addDetails(@RequestBody signup pm)
	{
		return sserv.saveInfo(pm);
	}
	
	@GetMapping("/getSign")
	public List <signup> getDetails(){
		return sserv.getInfo();
	}
	@PostMapping("/signup")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=sserv.checkLogin(username,password);
		return result;
	}

}