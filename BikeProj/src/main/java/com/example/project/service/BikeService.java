package com.example.project.service;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.example.project.model.Bike;
import com.example.project.repository.BikeRepo;
import jakarta.transaction.Transactional;

@Service
public class BikeService {
	@Autowired
	public BikeRepo repobj;
	public Bike saveInfo( Bike obj1)
	{
		return repobj.save(obj1);
	}

	public List<Bike> getAllbike()
	{
		List<Bike> bikeList=repobj.findAll();
		return bikeList;
		
	}
	public Bike updateInfo( Bike obj1)
	{
		return repobj.save(obj1);
	}
	public void deleteInfo(int id)
	{
		repobj.deleteById(id);
	}
	
	public List<Bike> sort(String id) {
		return repobj.findAll(Sort.by(id));
	}
public List<Bike> sortdcStudents(String field)
{
	return repobj.findAll(Sort.by(Direction.DESC,field));
}
    public  Page<Bike> pagingBike(int offset, int pageSize) {
		Pageable paging=PageRequest.of(offset,pageSize);
		Page<Bike>studData=repobj.findAll(paging);
	    return studData;
}
    public List<Bike> pagingAndSortingEmployees(int offset,
			int pageSize,String field) {
		Pageable paging = PageRequest.of(offset, pageSize).withSort(Sort.by(field));
			Page<Bike> stud=repobj.findAll(paging);
			return stud.getContent();
		}
@Transactional
public  int deleteStudentByName(String name) {
	return repobj.deleteStudentByName(name);
}
@Transactional
public int updateBike(String email,String name)
{
	return repobj.updateBike(email, name);
}
	public List<Bike> fetchStudentsByNamePrefix(String prefix) {
	
		return repobj.findByNameStartingWith(prefix);
	}
	public List<Bike> fetchStudentsByNamesuffix(String suffix) {
		
		return repobj.findByNameEndingWith(suffix);
	}
	@Transactional
	public List<Bike> fetchStudent(String name) {
		return repobj.fetchStudent(name);
	}
	public List<Bike> fetchbybrand(String brand, String name) 
	{
		return repobj.fetchbybrand(brand, name);
	
	}
	}