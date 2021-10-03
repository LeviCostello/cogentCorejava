package com.cogent.employeemanagementsystem.model;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

public class Manager extends Employee {

	//important aspects is memory management
	private String managerId;
	private float projectAllow;
	
	public String setManagerId() {
		return managerId;
	}
	public float getProjectAllow() {
		return projectAllow;
	}
	
	@Override
	public float calculateSalary() {
		// TODO Auto-generated method stub
		return super.calculateSalary();
	}
	
	public Manager() throws InvalidSalaryException {
		//System.out.println("hello from manager default conststructor");
		this("","","",1000.0f,1000.0f,"");//calls to another constructor from the same class
	}
	public Manager(String empId, String firstName, String lastName,
			float empSalary, float projectAllow, String managerId) throws InvalidSalaryException {
		super(empId, firstName, lastName, empSalary);//it will give a call to constructor from parent class
		this.projectAllow = projectAllow;
		this.managerId = "manager";
	}
}
                                                                               