package com.pspcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pspcl.model.AddEmployee;

public interface AddEmployeeRepository extends JpaRepository<AddEmployee, Integer> {

}
