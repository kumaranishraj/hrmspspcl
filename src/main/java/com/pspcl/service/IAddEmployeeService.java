package com.pspcl.service;

import java.util.List;

import com.pspcl.model.AddEmployee;

public interface IAddEmployeeService {
	
	public void addEmployee(AddEmployee employee) ;
	public List<AddEmployee> getAllEmployee() ;
	public int updateEmployee(AddEmployee employee);
	public void deleteEmployee(AddEmployee employee);
	
}
