package com.employee.Employee.datamodel;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="EMPLOYEE")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	@Id
	long id;
	
	@Column
	String name;
	
	@Column
	long salary;
	
	@Column(columnDefinition = "TIMESTAMP")
	LocalDateTime dob;
	
	@Column
	String dept;

	
}
