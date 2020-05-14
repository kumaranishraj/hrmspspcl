package com.pspcl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Asset {
	@Id
	@GeneratedValue
	private Integer id;
	@NonNull
	private Long mobileNumber;
	@NonNull
	private String mobileCode;
	@NonNull
	private String printerCode;
}
