package com.example.project.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Bike;

@Repository
public interface BikeRepo  extends JpaRepository<Bike, Integer>,CrudRepository<Bike, Integer>{
	 Bike findByUsername(String email);
	@Modifying
	@Query("delete from Bike s where s.name=?1")
	public int deleteStudentByName(String name);
	@Modifying
	@Query("update Bike s set s.email=?1 where s.name=?2")
	public int updateBike(String email,String name);
	@Query(value="select*from Bike s where s.name=?1",nativeQuery=true)
	public List<Bike>fetchStudent(String name);
	@Query("select s from Bike s where s.brand=?1 and s.name=?2")
	public List<Bike>fetchbybrand(String brand,String name);
	List<Bike> findByNameStartingWith(String prefix);
	List<Bike> findByNameEndingWith(String suffix);
	List<Bike> findByModel(String model);
}
