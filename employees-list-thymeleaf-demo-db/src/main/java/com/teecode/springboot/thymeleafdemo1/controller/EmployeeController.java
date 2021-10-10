package com.teecode.springboot.thymeleafdemo1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teecode.springboot.thymeleafdemo1.entity.Employee;
import com.teecode.springboot.thymeleafdemo1.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService theEmployeeService) {
		
		employeeService=theEmployeeService;
		
	}
	
	// add mapping for "/list"
	
	@GetMapping("/list")
	public String listEmployees(Model theModel){
		
		// get Employees from the database
		List<Employee>theEmployees = employeeService.findAll();
		
		
		// add to the Spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}
