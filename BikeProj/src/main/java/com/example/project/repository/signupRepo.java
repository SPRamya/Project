package com.example.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.model.signup;

public interface signupRepo  extends JpaRepository<signup, Integer> {
	signup findByusername(String username);

}