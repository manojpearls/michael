package com.employee.Employee.dto;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDTO{

	private static final long serialVersionUID=-235235346462346L;
	
	long id;
	
	LocalDateTime dob;
	
	String name;
	
	long salary;
	
	String dept;
	
}
