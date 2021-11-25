package com.employee.Employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.Employee.datamodel.Employee;
import com.employee.Employee.dto.EmployeeDTO;

@Service
public interface EmployeeService {

	public boolean addEmployee(EmployeeDTO employeeDTO);
	
	public boolean updateEmployee(EmployeeDTO employeeDTO);
	
	public boolean deleteEmployee(long id);
	
	public EmployeeDTO getEmployee(long id);
	
	public List<EmployeeDTO> getAllEmployees();
	
}
