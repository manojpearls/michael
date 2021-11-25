package com.employee.Employee.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.Employee.datamodel.Employee;

@Repository
public interface EmployeeDAO extends CrudRepository<Employee, Long>{

}
