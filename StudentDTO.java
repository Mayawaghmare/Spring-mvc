package com.jspiders.springmvc.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class StudentDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	private String email;

	private String userName;

	private String password;

	public void setPassword(String password2) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		
	}

	public void setUserName(String userName2) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


