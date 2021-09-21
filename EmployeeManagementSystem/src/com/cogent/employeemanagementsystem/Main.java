package com.cogent.employeemanagementsystem;

import java.util.Iterator;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;

public class Main {

	

	public static void main(String[] args) {
		//employee is a local reference 
		//Employee employee = new Employee();
		//it must be initalized but it won't print anything cause its null
		//Employee employee3 = null;
		//int a = 10;
		//classname reference = object
		Employee employee = new Employee("ab001", "abhi", "chivate", 100.0f, "PA");
		EmployeeService employeeService = new EmployeeService();
		
		String result = employeeService.addEmployee(employee);
		System.out.println(result);
		
		
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
	}

}
