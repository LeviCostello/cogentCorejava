package com.cogent.employeemanagementsystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data //create all the getters and setters
@AllArgsConstructor //create all the parameterized constructors
public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	//setter methods to retrieve the values we need getter methods
	public Employee() {
		this.employeeId="";
	}	
}
