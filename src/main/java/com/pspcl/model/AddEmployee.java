package com.pspcl.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AddEmployee{
	@Id
//	?@SequenceGenerator(name = "mySeqGen", sequenceName = "mySeq", initialValue = 100, allocationSize = 50)
//	  @GeneratedValue(generator = "mySeqGen")
	@GeneratedValue
	private Integer eid;
	private String empId;
	private String name;
	private String email;
	private String mobile;
	private Date dob;
	private String address;
	private String city;
	private String state;
	private String postalCode;
	
}
