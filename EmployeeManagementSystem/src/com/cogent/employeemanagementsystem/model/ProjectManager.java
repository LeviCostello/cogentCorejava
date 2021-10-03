package com.cogent.employeemanagementsystem.model;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;

public class ProjectManager extends Manager {

//	public ProjectManager() {
//		String[] tech;
//		
//	}
	public ProjectManager(String empId, String firstName, String lastName,
			float empSalary, float projectAllow, String managerId, String[] tech) throws InvalidSalaryException {
		super(empId, firstName, lastName, empSalary, projectAllow, managerId);//it will give a call to constructor from parent class
		//this.tech = tech;
	}
}
