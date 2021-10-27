package com.cogent.emsjdbc.service;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Optional;

import com.cogent.emsjdbc.repository.EmployeeRepository;
import com.cogent.emsjdbc.repository.EmployeeRepositoryImpl;
import com.cogent.emsjdbc.service.EmployeeService;
import com.cogent.emsjdbc.service.EmployeeServiceImpl;
import com.cogent.emsjdbc.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository = EmployeeRepositoryImpl.getInstance();
	
	private static EmployeeService employeeService;
	
	public static EmployeeService getInstance() {
		if(employeeService==null) {
			employeeService = new EmployeeServiceImpl();
			return employeeService;
		}
		return employeeService;
	}
	
	public String addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}
	
	public Optional<List<Employee>> getEmployeeById(String id){
		return employeeRepository.getEmployeeById(id);
	}
	public Optional<List<Employee>> getEmployees() {
		return employeeRepository.getEmployees();
	}

	public String deleteEmployeeById(String id){
		return employeeRepository.deleteEmployeeById(id);
	}

	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
	}

	public String updateEmployee(Employee employee){
		return employeeRepository.updateEmployee(employee);
	}

	public Employee[] getEmployeeByName(String firstName) {
		return null;
	}

	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
