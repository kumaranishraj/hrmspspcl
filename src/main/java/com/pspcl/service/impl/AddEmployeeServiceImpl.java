package com.pspcl.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pspcl.model.AddEmployee;
import com.pspcl.repo.AddEmployeeRepository;
import com.pspcl.service.IAddEmployeeService;
@Service
public class AddEmployeeServiceImpl implements IAddEmployeeService {

	@Autowired
	private AddEmployeeRepository addrepo;


	@Override
	public void addEmployee(AddEmployee employee) {
		/*
		 * DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"); String d =
		 * new SimpleDateFormat("MM/dd/yyyy").format(employee.getDob()); Date date1; try
		 * { date1 = new SimpleDateFormat("dd/MM/yyyy").parse(d);
		 * employee.setDob(date1); } catch (ParseException e) { e.printStackTrace(); }
		 */
        
		addrepo.save(employee);
	}


	@Override
	public List<AddEmployee> getAllEmployee() {
		List<AddEmployee> list = addrepo.findAll();
		return list;
	}


}
