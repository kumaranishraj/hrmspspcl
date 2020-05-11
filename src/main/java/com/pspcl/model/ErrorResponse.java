package com.pspcl.model;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {
	private Date timestamp;
	private Integer statusCode;
	private HttpStatus status;
	private String message;
    private List<String> details;
}
