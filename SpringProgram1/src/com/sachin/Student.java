package com.sachin;

public class Student 
{
	private String name;
	private int rollno;
	private String email;

	// getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// method for calling in main method
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Rollno:"+rollno);
		System.out.println("Email:"+email);

	}
	
	
	
	
}
