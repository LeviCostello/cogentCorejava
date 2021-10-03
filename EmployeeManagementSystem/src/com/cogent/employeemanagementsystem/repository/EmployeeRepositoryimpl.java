package com.cogent.employeemanagementsystem.repository;

import java.io.IOException;
import java.util.Iterator;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.model.Employee;

public class EmployeeRepositoryimpl implements EmployeeRepository {

	private Employee employees[] = new Employee[10];
	
	private static EmployeeRepository employeeRepository;
	
	private EmployeeRepositoryimpl() {
		
	}
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepositoryimpl();
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
	public Employee getEmployeeById(String id) throws IdNotFoundException, IOException {
		//to throw the checked exception to the caller
		for(Employee employee: employees) {
			if(employee != null && id.equals(employee.getEmployeeId())) {
				throw new IOException();
				//return employee;
			}
		}
		//this will throw the exception
		throw new IdNotFoundException("id not found");
		//return null;
	}
	public Employee[] getEmployees() {
		return employees;
	}
	public String deleteEmployeeById(String id) throws IdNotFoundException, IOException {
		//check if Id exists
		Employee employee = this.getEmployeeById(id);
		int index = this.getIndex(employee);
		if(index != -1) {
			employees[index] = null;
			return "Deletion sucess";
		}else {
			return "not found";
		}
		//id exits then set location to null
		//if return notfound
	}
	private int getIndex(Employee employee) {
		for (int i = 0; i < employees.length; i++) {
			if(employees[i].equals(employee)) {
				return i;
			}
		}
		return -1;
	}
	private static int index = 0;
	@Override
	public void deleteAllEmployees() {
		employees = null;
		
	}
	public String updateEmployee(String id, Employee employee) throws IdNotFoundException, IOException {
		this.getEmployeeById(id);
		//this.getIndex(employee);
		int index = this.getIndex(employee);
		employees[index] = employee;
		return "success";
	}
	public Employee[] getEmployeeByName(String firstName) {
		Employee[] employeesTemp = new Employee[employees.length];
		for(Employee e : employees) {
			if(e.getFirstName().equals(firstName)) {
				employeesTemp [index] = e;
			}
		}
		return employeesTemp;
	}
}