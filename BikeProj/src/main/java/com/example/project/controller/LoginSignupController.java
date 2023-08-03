package com.example.project.controller;

	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.CrossOrigin;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.LoginSignup;
import com.example.project.service.LoginSignupService;


	@RestController
	@CrossOrigin("http://localhost:3000")
	public class LoginSignupController {
		
		@Autowired
		public LoginSignupService object1;
		@PostMapping("/login")
	    public String login(@RequestBody Map<String,String> loginData)
	    {
	  	 String emailid = loginData.get("emailid");
	  	 String password = loginData.get("password");
	  	 String result = object1.checkLogin(emailid,password);
	  	 return result;
	    }
		//SignIn
		@PostMapping("/postlogin")
		public LoginSignup postSignIn(@RequestBody LoginSignup p)
		{
			return object1.EnterDetails(p);
		}
		//SignUp
		@GetMapping("/getsignup")
		public List<LoginSignup> findAll()
		{
			return object1.getUserSignUp();
		}
		@PostMapping("/postsignup")
		public String addUser(@RequestBody LoginSignup p)
		{
			return object1.addUserSignUp(p);
		}
		@PutMapping(value="/updatesignup")
		public LoginSignup updateUser(@RequestBody LoginSignup s)
		{
			return object1.updateUserSignUp(s);
		}
		@DeleteMapping("/deletesignup/{email}")
		public void deleteUser(@PathVariable("email") String email)
		{
			object1.deleteUserSignUp(email);
		}

	}