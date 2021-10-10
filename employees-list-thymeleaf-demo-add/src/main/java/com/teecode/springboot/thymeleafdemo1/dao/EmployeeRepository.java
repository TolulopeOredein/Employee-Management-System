package com.teecode.springboot.thymeleafdemo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teecode.springboot.thymeleafdemo1.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	
}
