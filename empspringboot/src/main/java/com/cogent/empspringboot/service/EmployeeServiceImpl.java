package com.cogent.empspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.empspringboot.dto.Employee;
import com.cogent.empspringboot.repository.EmployeeRepository;

//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;
	
	public Optional<Employee> addEmployee(Employee employee) {
		Employee employee2 = employeeRepository.save(employee);
		return Optional.ofNullable(employee2);
	}
	
	public Optional<List<Employee>> getEmployeeById(String id){
		return null;
	}
	public Optional<List<Employee>> getEmployees() {
		return null;
	}

	public String deleteEmployeeById(String id){
		return null;
	}

	public void deleteAllEmployees() {
	}

	public String updateEmployee(Employee employee){
		return null;
	}

	public Employee[] getEmployeeByName(String firstName) {
		return null;
	}

	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}
