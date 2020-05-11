package com.pspcl.rest.controller;

import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pspcl.HrmspspclApplication;
import com.pspcl.exception.RecordNotFoundException;
import com.pspcl.model.AddEmployee;
import com.pspcl.service.IAddEmployeeService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping({"/employees"})
public class AddEmployeeRestController {
	private static final Logger LOGGER = LogManager.getLogger(HrmspspclApplication.class);
	@Autowired
	private IAddEmployeeService addservice;
	
	
	@PostMapping("/addemployee")
	public ResponseEntity<String> addEmployee(@RequestBody AddEmployee employee) {
		Random random = new Random();
		String id = String.format("%04d", random.nextInt(10000));
		employee.setEmpId(id);
		addservice.addEmployee(employee);
		 LOGGER.info("AddEmployeeController addEmployee() called....");
		return new ResponseEntity<String>(employee.toString(), HttpStatus.OK);
	}
	
	@PostMapping("/updateemployee/{eid}")
	public ResponseEntity<String> updateEmployee(@RequestBody AddEmployee employee, @PathVariable("eid") int eid) {
		employee.setEid(eid);
		System.out.println("update employee---"+employee);
		addservice.updateEmployee(employee);
		 LOGGER.info("AddEmployeeController updateEmployee() called....");
		return new ResponseEntity<String>(employee.toString(), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteemployee/{eid}")
	//@DeleteMapping(path = { "/{eid}" })
	public ResponseEntity<String> deleteEmployee(@PathVariable("eid") int eid,@RequestBody AddEmployee employee) {
		employee.setEid(eid);
		System.out.println(eid+"  ======= delete employee---"+employee);
		//addservice.deleteEmployee(employee);
		 LOGGER.info("AddEmployeeController deleteEmployee() called....");
		return new ResponseEntity<String>(employee.toString(), HttpStatus.OK);
	}
	
	@GetMapping("/getallemployee")
	public ResponseEntity<List<AddEmployee>> getAllEmployee(){
		List<AddEmployee> list = addservice.getAllEmployee();
		if(list==null) {
			throw new RecordNotFoundException("NO RECORD FOUND");
		}
		LOGGER.info("AddEmployeeController getAllEmployee() called...."+list);
		return new ResponseEntity<List<AddEmployee>>(list, HttpStatus.OK);
	}
}
