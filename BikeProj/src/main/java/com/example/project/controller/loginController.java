package com.example.project.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.login;
import com.example.project.service.loginService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
@RequestMapping("/user")
public class loginController {
	
	@Autowired
	private loginService lser;
	
	@PostMapping("/log")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username,password);
		return result;
	}
	@PutMapping("/put")
	public login putUser(@RequestBody login cl)
	{
		return lser.putUser(cl);
	}
	@PostMapping("/adduser")
	public login AddUser(@RequestBody login cl)
	{
		return lser.addUser(cl);
	}
	
	@GetMapping("/showall")

	public List<login> listAll()
	{
		return lser.getUser();
	}
	@DeleteMapping("/delete")
	public String deleteData(@RequestParam int id)
	{
		lser.deleteInfo(id);
		return "Delete";
	}
}