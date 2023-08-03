package com.example.project.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.signup;
import com.example.project.repository.signupRepo;
@Service
public class signupService {

	@Autowired
	public signupRepo srep;
	public signup saveInfo(signup ab)
	{
		return srep.save(ab);
	}
	public List <signup> getInfo(){
		return srep.findAll();
	}
	public String checkLogin(String username,String password)
	{
	signup user= srep.findByusername(username);
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPassword().equals(password))
		{
			return "Signup Succesful";
		}
		else
		{
			return "Signup Failed";
		}
	}

   }
}