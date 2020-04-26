package com.pspcl.model.rest.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pspcl.model.AddEmployee;
import com.pspcl.service.IAddEmployeeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping({"/employees"})
public class AddEmployeeRestController {
	@Autowired
	private IAddEmployeeService addservice;
	
	
	@PostMapping("/addemployee")
	public AddEmployee addEmployee(@RequestBody AddEmployee employee) {
		Random random = new Random();
		String id = String.format("%04d", random.nextInt(10000));
		employee.setEmpId(id);
		addservice.addEmployee(employee);
		return employee;
	}
	@GetMapping("/getallemployee")
	public List<AddEmployee> getAllEmployee(){
		List<AddEmployee> list = addservice.getAllEmployee();
		return list;
	}
}
