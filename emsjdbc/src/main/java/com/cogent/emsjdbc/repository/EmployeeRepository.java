package com.cogent.emsjdbc.repository;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.cogent.emsjdbc.dto.Employee;

public interface EmployeeRepository {

	public String addEmployee(Employee employee );
	public String deleteEmployeeById(String id) ;
	public void deleteAllEmployees();
	public Optional<List<Employee>> getEmployeeById(String id) ;
	public Optional<List<Employee>> getEmployees();
	public String updateEmployee(Employee employee);
	public boolean isEmployeeExists(String id);
	
	
	
}