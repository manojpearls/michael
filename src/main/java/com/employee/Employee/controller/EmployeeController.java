package com.employee.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee.dto.EmployeeDTO;
import com.employee.Employee.service.EmployeeService;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping( value = "/add", method = RequestMethod.POST)
	public ResponseEntity<?> addEmployee(@RequestBody EmployeeDTO employeeDTO){
		
		return ResponseEntity.ok(employeeService.addEmployee(employeeDTO));
	
	}

	@RequestMapping( value ="/getEmployee", method = RequestMethod.GET)
	public ResponseEntity<?> getEmployee(@RequestParam long id){
		return ResponseEntity.ok(employeeService.getEmployee(id));
	}
}
