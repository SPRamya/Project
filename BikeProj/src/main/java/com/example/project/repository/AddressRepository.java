package com.example.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
