package com.example.project.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LoginSignup {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String emailid;
	private String password;
	private String confirm_password;
	private String phonenumber;
	
	public LoginSignup() {
		super();
	}
	@Override
	public String toString() {
		return "LoginSignup [id=" + id + ", username=" + username + ", emailid=" + emailid + ", password=" + password
				+ ", confirm_password=" + confirm_password + ", phonenumber=" + phonenumber + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
}
