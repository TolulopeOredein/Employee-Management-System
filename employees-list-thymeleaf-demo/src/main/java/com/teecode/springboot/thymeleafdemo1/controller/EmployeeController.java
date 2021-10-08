package com.teecode.springboot.thymeleafdemo1.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teecode.springboot.thymeleafdemo1.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	// load employee data
	
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		// create Enployees
		Employee emp1 = new Employee (1, "Adebola", "Akinjide", "adebolaakinjide@yahoo.com");
		Employee emp2 = new Employee (2, "Sola", "Makinwa", "solamakinwa@yahoo.com");
		Employee emp3 = new Employee (3, "Kayode", "Oluseyi", "kayodeoluseyi@yahoo.com");
		
		// create list
		theEmployees = new ArrayList<>();
		
		// add the employees to the List
		
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
	
		
	}
	
	// add mapping for "/list"
	
	@GetMapping("/list")
	public String listEmployees(Model theModel){
		
		// add to the Spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
}
