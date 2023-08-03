package com.example.project.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.LoginSignup;




@Repository
public interface LoginSignupRepo extends JpaRepository <LoginSignup,Integer>{

	LoginSignup findByUsername(String username);

	void deleteByEmailid(String email);

	LoginSignup findByEmailid(String emailid);
	
	
	

}