package com.employee.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Employee.dao.EmployeeDAO;
import com.employee.Employee.datamodel.Employee;
import com.employee.Employee.dto.EmployeeDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public boolean addEmployee(EmployeeDTO employeeDTO) {
		
		Employee emp = Employee.builder()
					    .name(employeeDTO.getName())
					   .dept(employeeDTO.getDept())
					   .dob(employeeDTO.getDob())
					   .salary(employeeDTO.getSalary())
					   .build();
					   
		emp = employeeDao.save(emp);
		
		return emp!=null;
	}

	@Override
	public boolean updateEmployee(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EmployeeDTO getEmployee(long id) {
		Employee emp = employeeDao.findById(id).get();
		
		EmployeeDTO empDTO = EmployeeDTO.builder()
				.id(emp.getId())
				.name(emp.getName())
				.dept(emp.getDept())
				.dob(emp.getDob())
				.salary(emp.getSalary())
				.build();
				
		return empDTO;
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
