package com.teecode.springboot.thymeleafdemo1.service;

import java.util.List;

import com.teecode.springboot.thymeleafdemo1.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
