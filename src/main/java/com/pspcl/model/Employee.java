package com.pspcl.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private Date dob;
	private String email;
	private String password;
	@Transient
	private String cnfPassword;
	//private Address address;
	
}
