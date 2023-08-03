package com.example.project.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.Bike;
import com.example.project.service.BikeService;

@RestController
public class BikeController {
  @Autowired
  
  public BikeService serobj;
  @PostMapping("/post")
  public Bike addDetails(@RequestBody Bike obj)
  {
	  return serobj.saveInfo(obj);
  }
  
  @GetMapping("/get")
  public List<Bike> getAllbike()
  {
	  List<Bike>bikelist=serobj.getAllbike();
	  return bikelist;
  }
@PutMapping("/put")
public Bike updateData(@RequestBody Bike b,@RequestParam int id)
{
	b.setId(id);
	return serobj.updateInfo(b);
}
@DeleteMapping("/delete")
public String deleteData(@RequestParam int id)
{
	serobj.deleteInfo(id);
	return "Deleted Successfully";
}
@GetMapping("/sorting/{id}")
public List<Bike> SortDetails(@PathVariable("id") String id)
{
	return serobj.sort(id);
}
@GetMapping("/deSorting/{field}")
public List<Bike>sortdcStudents(@PathVariable String field)
{
	return serobj.sortdcStudents(field);
}
@GetMapping("/paging/{offset}/{pageSize}")
public Page<Bike>pagingStudents(@PathVariable("offset") int offset,@PathVariable("pageSize") int pageSize)
{
	return serobj.pagingBike(offset, pageSize);
}
@GetMapping("/pagingAndSorting/{offset}/{pageSize}/{field}")

public List<Bike> pagingAndSortingBike(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
{
	return serobj.pagingAndSortingEmployees(offset, pageSize, field);
}
@GetMapping("/fetch/{prefix}")
public List<Bike> fetchStudentsByNamePrefix(@PathVariable String prefix)
{
	  return serobj.fetchStudentsByNamePrefix(prefix);
}
@GetMapping("/fetchs/{suffix}")
public List<Bike> fetchStudentsByNamesuffix(@PathVariable String suffix)
{
	  return serobj.fetchStudentsByNamesuffix(suffix);
}
@DeleteMapping("/delete/{name}")
public String deleteStudentByName(@PathVariable String name )
{
	int result=serobj.deleteStudentByName(name);
	if(result>0)
		return "Customer record deleted";
	else
		return"Problem occured while deleting";
}
@GetMapping("/get/{brand}/{name}")
public List<Bike>fetchbybrand(@PathVariable String brand,@PathVariable String name)
{
	return serobj.fetchbybrand(brand,name);
}
@PutMapping("/update/{email}/{name}")
public String updateBike(@PathVariable String email,@PathVariable String name)
{
	int res=serobj.updateBike(email,name);
	if(res>0)
		return "Customer record updated";
	else
		return "Problem occured while updating";
}
@GetMapping("fetchbystaff/{name}")
public List<Bike> fetchStudent(@PathVariable String name){
	return serobj.fetchStudent(name);
}

}
