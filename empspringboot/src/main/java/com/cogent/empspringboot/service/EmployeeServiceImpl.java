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
	
	public Optional<Employee> getEmployeeById(String id){
		return employeeRepository.findById(id);
	}
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public void deleteEmployeeById(String id){
		employeeRepository.deleteById(id);;
	}

	public void deleteAllEmployees() {
		employeeRepository.deleteAll();
	}

	public Optional<Employee> updateEmployee(Employee employee){
		Employee employee2 = employeeRepository.save(employee);
		return Optional.ofNullable(employee2);
	}

	public Employee[] getEmployeeByName(String firstName) {
		return null;
	}

	public boolean isEmployeeExists(String id) {
		return employeeRepository.existsById(id);
	}
}
