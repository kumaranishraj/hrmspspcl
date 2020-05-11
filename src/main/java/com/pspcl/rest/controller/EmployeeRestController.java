package com.pspcl.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pspcl.model.Employee;
import com.pspcl.service.IEmployeeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping({"/employees"})
public class EmployeeRestController {
	@Autowired
	private IEmployeeService service;
	
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		System.out.println("----1---"+employee);
		System.out.println("----2---"+employee.getPassword());
		service.saveEmployee(employee);
		
		return employee;
	}

}
