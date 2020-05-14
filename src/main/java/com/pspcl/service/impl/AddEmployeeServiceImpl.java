package com.pspcl.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pspcl.HrmspspclApplication;
import com.pspcl.model.AddEmployee;
import com.pspcl.model.Asset;
import com.pspcl.repo.AddEmployeeRepository;
import com.pspcl.service.IAddEmployeeService;
@Service
public class AddEmployeeServiceImpl implements IAddEmployeeService {
	private static final Logger LOGGER = LogManager.getLogger(HrmspspclApplication.class);
	@Autowired
	private AddEmployeeRepository addrepo;


	@Override
	public void addEmployee(AddEmployee employee){
		addrepo.save(employee);
		LOGGER.info("AddEmployeeServiceImpl addEmployee() called...");
	}


	@Override
	public List<AddEmployee> getAllEmployee() {
		List<AddEmployee> list = addrepo.findAll();
		LOGGER.info("AddEmployeeServiceImpl getAllEmployee() called..."+list);
		return list;
	}


	@Override
	public int updateEmployee(AddEmployee employee) {

		return ((AddEmployee) addrepo.save(employee)).getEid();
	}


	@Override
	public void deleteEmployee(AddEmployee employee) {

		addrepo.delete(employee);
	}



}
