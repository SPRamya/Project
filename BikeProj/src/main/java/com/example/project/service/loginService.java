package com.example.project.service;
import com.example.project.model.login;
import com.example.project.repository.loginRepo;

import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	@Service

public class loginService {

	@Autowired
	private loginRepo lrepo;
	public String checkLogin(String username,String psword)
	{
		login user= lrepo.findByusername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(psword))
			{
				return "Login Succesfull";
			}
			else
			{
				return "Login Failed";
			}
		}
	} 
	public login addUser(login cl)
	{
		return lrepo.save(cl);
	}
	public List<login> getUser()
	{
		return lrepo.findAll();
	}
	public login putUser(login cl)
	{
		return lrepo.save(cl);
	}
	public void deleteInfo(int id)
	{
		lrepo.deleteById(id);
	}
	}