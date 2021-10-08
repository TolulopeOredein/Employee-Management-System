package com.teecode.springboot.thymeleafdemo1.model;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String Email;
	
	public Employee() {
		
	}

	public Employee(int id, String firstName, String lastName, String email) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		Email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Email=" + Email + "]";
	}
	

	
}
