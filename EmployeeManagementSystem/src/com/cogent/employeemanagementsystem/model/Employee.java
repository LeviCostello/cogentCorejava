package com.cogent.employeemanagementsystem.model;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

//@Data //create all the getters and setters
//@AllArgsConstructor //create all the parameterized constructors
@ToString
public class Employee 
//implements Comparable<Employee>
{

	private String employeeId;
	private String firstName;
	private String lastName;
	private float empSalary;
	private String address;
	//setter methods to retrieve the values we need getter methods
	public Employee() {
		this.employeeId="";
		System.out.println("hello from employee default constructor");
	}
	
	public float calculateSalary() {
		return empSalary + 500;
	}
	
	public Employee(String employeeId, String firstName, String lastName, float empSalary) throws InvalidSalaryException {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.empSalary = empSalary; rather than this do this
		this.setEmpSalary(empSalary);
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) throws InvalidSalaryException {
		//salary is not negative
		//if it is negative then we raise an invalidsalaryexception
		if(empSalary>0)
		this.empSalary = empSalary;
		else
			throw new InvalidSalaryException("Salary should not be negative");
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	/*
	 * @Override public int compareTo(Employee o) { // can we arrange the employees
	 * on the basis of empId return this.employeeId.compareTo(o.employeeId); }
	 */
}
