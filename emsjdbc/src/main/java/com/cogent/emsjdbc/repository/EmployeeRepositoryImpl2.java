package com.cogent.emsjdbc.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cogent.emsjdbc.dto.Employee;
import com.cogent.emsjdbc.utils.DBUtils;

public class EmployeeRepositoryImpl2 implements EmployeeRepository {
	private static EmployeeRepository employeeRepository;
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepositoryImpl2();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	private EmployeeRepositoryImpl2() {
	}
	
	public String addEmployee(Employee employee) {
		return null;
	}
	
	// this method should give us employee details on the basis of id
	public Optional<List<Employee>> getEmployeeById(String id) {
		return null;
	}
	
	//optional helps us with the null pointer problem
	public Optional<List<Employee>> getEmployees() {
		return null;
	}
	
	public String deleteEmployeeById(String id) {
		return null;
	}

	public void deleteAllEmployees() {
	}

	public String updateEmployee(Employee employee) {
		return null;
	}

	public boolean isEmployeeExists(String id) {
		return false;
	}
}