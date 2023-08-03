package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike{
	@Id
 private int id;
	private String name;
	private String email;
	private String phno;
	private String brand;
	private long price;
    private String model;
    private long mileage;
    private String colour;
    private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getMileage() {
		return mileage;
	}
	public void setMileage(long mileage) {
		this.mileage = mileage;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	private String address;
 public String getBrand() {
		return brand;
	}
	public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhno() {
	return phno;
}
public void setPhno(String phno) {
	this.phno = phno;
}
}
