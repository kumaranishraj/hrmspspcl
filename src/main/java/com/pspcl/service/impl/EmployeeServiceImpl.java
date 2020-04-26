package com.pspcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.pspcl.model.AddEmployee;
import com.pspcl.model.Employee;
import com.pspcl.repo.AddEmployeeRepository;
import com.pspcl.repo.EmployeeRepository;
import com.pspcl.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	public void saveEmployee(Employee employee) {
		System.out.println(employee.getPassword()+"----from service");
		String encPassword = passwordEncoder.encode(employee.getPassword());
		employee.setPassword(encPassword);
		System.out.println("encPassword==="+encPassword);
		System.out.println("---=====***"+passwordEncoder.matches(employee.getPassword(), encPassword));
		repo.save(employee);
	}
	
	

}
