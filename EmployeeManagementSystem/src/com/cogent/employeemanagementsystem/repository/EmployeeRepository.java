package com.cogent.employeemanagementsystem.repository;

import java.util.Iterator;

import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepository {

	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepository employeeRepository;
	
	private EmployeeRepository() {	
	}
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepository();
			return employeeRepository;
		}
		return employeeRepository;
	}
	static int counter = 0;
	public String addEmployee(Employee employee) {
		//do we need to maintain the index for an employees array
		if(counter >= employees.length) {
			return "array is full";
		}
		employees[counter++] = employee;
		return "success";
	}
	
	//this method should give us employee details on the basis of id
	public Employee getEmployeeById(String id) {
		for(Employee employee: employees) {
			if(employee != null && id.equals(employee.getEmployeeId())) {
				return employee;
			}
		}
		return null;
	}
}