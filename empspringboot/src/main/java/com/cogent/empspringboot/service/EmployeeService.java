package com.cogent.empspringboot.service;

import java.util.List;
import java.util.Optional;

import com.cogent.empspringboot.dto.Employee;

public interface EmployeeService {

	public Optional<Employee> addEmployee(Employee employee );
	public void deleteEmployeeById(String id) ;
	public void deleteAllEmployees();
	public Optional<Employee> getEmployeeById(String id) ;
	public List<Employee> getEmployees();
	public Optional<Employee> updateEmployee(Employee employee);
	public boolean isEmployeeExists(String id);
}
