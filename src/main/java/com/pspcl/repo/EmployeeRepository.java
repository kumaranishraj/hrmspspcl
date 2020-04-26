package com.pspcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pspcl.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
