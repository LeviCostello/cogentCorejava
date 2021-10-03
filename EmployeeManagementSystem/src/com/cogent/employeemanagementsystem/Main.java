package com.cogent.employeemanagementsystem;

import java.io.IOException;
import java.util.Iterator;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {

	

	public static void main(String[] args) throws IOException, InvalidSalaryException, IdNotFoundException {
		//employee is a local reference 
		//Employee employee = new Employee();
		//it must be initalized but it won't print anything cause its null
		//Employee employee3 = null;
		//int a = 10;
		//classname reference = object
//		System.out.println(employee2.getEmployeeId());
//		System.out.println(employee2.getFirstName());
//		System.out.println(employee2.getLastName());
//		System.out.println(employee2.getEmpSalary());
//		System.out.println(employee2.getAddress());
		//System.out.println(employee3.getAddress());
		
//		Employee employees[] = new Employee[10];
//		for (int i = 0; i < employees.length; i++) {
//			employees[i] = new Employee();                  
//		}
//		for(Employee employee4 : employees) {
//			System.out.println(employee4);
//		}
		
		//switch case to handle all options
		//1-add 2-getEmp by id 3-delete 4-update (assignment) 5-getall 6-exot
		
		//Employee employee = new Employee("ab001", "abhi", "chivate", 100.0f, "PA");
		//EmployeeService employeeService = new EmployeeService();
		
		//String result = employeeService.addEmployee(employee);
		//System.out.println(result);
		
		//Employee[] employees = employeeService.getEmployees();
		
//		for(Employee employee2 : employees) {
//			System.out.println(employee2);
//		}
		
		//variables
//		String Id = "ab001";
//		String fName = "abhi";
//		
//		//Employee getters
//		//what is the get intstance used for?
//		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
//		Employee employee = new Employee("ab001", "abhi", "chivate", 100.0f);
//		Employee employee2 = new Employee("lv002", "Levi", "Costello", 150.0f);
//		Employee employee3 = new Employee("bo003", "Donkey", "Kong", 80.0f);
//		Employee[] employees = employeeService.getEmployees();
//		Employee employeesId = employeeService.getEmployeeById(Id);
//		
//		//Update an emp record
//		employeeService.updateEmployee(Id, employee2);
//		
//		//delete an employee record
//		employeeService.deleteEmployeeById(Id);
//		
//		//delete all employee records
//		employeeService.deleteAllEmployees();
//		
//		// search an employee based on name
//		employeeService.getEmployeeByName(fName);
//
//		//print out the employees listed
//		for(Employee e : employees) {
//			System.out.println(e);
//		}
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		
		String result = null;
		try {
			result = employeeService.addEmployee(new Employee("ab001", "abhi", "chivate", 1234.0f));
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		if("success".equals(result)) {
			System.out.println("employee added successfully");
		}
	}

}
