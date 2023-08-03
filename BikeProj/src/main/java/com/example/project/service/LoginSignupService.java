package com.example.project.service;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.project.model.LoginSignup;
import com.example.project.repository.LoginSignupRepo;



	@Service
	public class LoginSignupService{
		
		@Autowired
		public LoginSignupRepo object;
		public String checkLogin(String emailid,String password)
		{
			LoginSignup user= object.findByEmailid(emailid);
			if(user==null)
			{
				return "No user found";
			}
			else
			{
				if(user.getPassword().equals(password))
				{
					return "Login Succesfull";
				}
				else
				{
					return "Login Failed";
				}
			}
		}
		public LoginSignup EnterDetails(LoginSignup cl)
		{
			return object.save(cl);
		}
		public List<LoginSignup> getUserSignUp()
		{
			return object.findAll();
		}
		
		public String  addUserSignUp(LoginSignup cl)
		{
			String emailid=cl.getEmailid();
					LoginSignup logi=object.findByEmailid(emailid);
			if (logi== null) {
				object.save(cl);
				return "Signup Successful";
			} else {
				if(logi.getEmailid().equals(emailid)) {
					return "Email Already Exists";
				}
				else {
					return"Invalid Email";
				}
			}
		}
		
	
		
		public LoginSignup updateUserSignUp(LoginSignup x)
		{
		    return object.save(x);
		}
		
		public void deleteUserSignUp (String emailid)
		{
			object.deleteByEmailid(emailid);
		}

	}