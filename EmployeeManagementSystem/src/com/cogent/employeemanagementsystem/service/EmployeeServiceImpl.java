package com.cogent.employeemanagementsystem.service;

import java.io.IOException;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.repository.EmployeeRepository;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryALImpl;
import com.cogent.employeemanagementsystem.repository.EmployeeRepositoryimpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository = EmployeeRepositoryALImpl.getInstance();
	
	public static EmployeeService employeeService;
	
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
	
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.getEmployeeById(id);
	}
	public Employee[] getEmployees() {
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		return employeeRepository.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();
	}

	@Override
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		return employeeRepository.updateEmployee(id, employee);
	}

	@Override
	public Employee[] getEmployeeByName(String firstName) {
		return employeeRepository.getEmployeeByName(firstName);
	}

}
