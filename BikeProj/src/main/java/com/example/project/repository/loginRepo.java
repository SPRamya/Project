package com.example.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.login;
@Repository
public interface loginRepo extends JpaRepository<login, Integer> {
	login findByusername(String username);

}

