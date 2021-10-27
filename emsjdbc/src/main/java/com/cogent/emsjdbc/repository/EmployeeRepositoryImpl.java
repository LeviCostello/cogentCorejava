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

public class EmployeeRepositoryImpl implements EmployeeRepository {
	DBUtils dbUtils = DBUtils.getInstance();
	private static EmployeeRepository employeeRepository;
	public static EmployeeRepository getInstance() {
		if(employeeRepository==null) {
			employeeRepository = new EmployeeRepositoryImpl();
			return employeeRepository;
		}
		return employeeRepository;
	}
	
	public String addEmployee(Employee employee) {
		Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into employee(empId, empFirstName, empLastName,doj,dob,empSalary) values(?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(insertStatement);
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setDate(4, new Date(employee.getDoj().getTime()));
			preparedStatement.setDate(5, new Date(employee.getDob().getTime()));
			preparedStatement.setFloat(6, employee.getEmpSalary());
			preparedStatement.executeUpdate();
			return "success";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		
		return null;
	}
	
	// this method should give us employee details on the basis of id
	public Optional<List<Employee>> getEmployeeById(String id) {
		Connection connection = dbUtils.getConnection();
		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from employee where empId ="+id;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Employee employee = new Employee();
				
				employee.setEmpId(resultSet.getString("empId"));
				employee.setEmpFirstName(resultSet.getString("empFirstName"));
				employee.setEmpLastName(resultSet.getString("empLastName"));
				employee.setDob(resultSet.getDate("dob"));
				employee.setDoj(resultSet.getDate("doj"));
				employee.setEmpSalary(resultSet.getFloat("empSalary"));
				
				arrayList.add(employee);
			}
			return Optional.ofNullable(arrayList);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		return Optional.empty();
	}
	
	//optional helps us with the null pointer problem
	public Optional<List<Employee>> getEmployees() {
		
		Connection connection = dbUtils.getConnection();
		ArrayList<Employee> arrayList = new ArrayList<>();
		
		String query = "select * from employee";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			
			resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Employee employee = new Employee();
				
				employee.setEmpId(resultSet.getString("empId"));
				employee.setEmpFirstName(resultSet.getString("empFirstName"));
				employee.setEmpLastName(resultSet.getString("empLastName"));
				employee.setDob(resultSet.getDate("dob"));
				employee.setDoj(resultSet.getDate("doj"));
				employee.setEmpSalary(resultSet.getFloat("empSalary"));
				
				arrayList.add(employee);
			}
			//optional has empty: returning null, 
			//of: if u r confirming about the object(empty vs null), 
			//ofNullable: if there is data return data or return null
//			if(arrayList.isEmpty()) {
//				return Optional.empty();
//			} else {
//				return Optional.of(arrayList);
//			}
			return Optional.ofNullable(arrayList);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		return Optional.empty();
	}
	
	public String deleteEmployeeById(String id) {
		int count = 0;
		Connection connection = dbUtils.getConnection();
		String query = "delete FROM productcrud.employee WHERE empId="+101;
		PreparedStatement preparedStatement = null;
		
		try {
			preparedStatement = connection.prepareStatement(query);
			count = preparedStatement.executeUpdate();
			if(count == 0)
				return null;
				
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		return (count+" records deleted");
	}
	
	private int getIndex(Employee employee) {
		return 0;
		
	}

	public void deleteAllEmployees() {
		int count = 0;
		Connection connection = dbUtils.getConnection();
		String query = "DELETE FROM employee";
		PreparedStatement ps = null;
		
		try {
			ps = connection.prepareStatement(query);
			count = ps.executeUpdate();
			if(count == 0)
				System.out.println("No Records Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		System.out.println(count+" records deleted");
		
	}

	public String updateEmployee(Employee employee) {
		/*Connection connection = dbUtils.getConnection();
		
		String insertStatement = "insert into employee(empId, empFirstName, empLastName,doj,dob,empSalary) values(?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(insertStatement);
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpFirstName());
			preparedStatement.setString(3, employee.getEmpLastName());
			preparedStatement.setDate(4, new Date(employee.getDoj().getTime()));
			preparedStatement.setDate(5, new Date(employee.getDob().getTime()));
			preparedStatement.setFloat(6, employee.getEmpSalary());
			preparedStatement.executeUpdate();
			return "success";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(connection);
		}
		
		return null;*/
		
		int count = 0;
		Connection con = dbUtils.getConnection();
		String query = "UPDATE employee SET empFirstName=?, empLastName=?, doj=?, dob=?, empSalary=? WHERE empId=?";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(query);
			ps.setString(6, employee.getEmpId());
			ps.setString(1, employee.getEmpFirstName());
			ps.setString(2, employee.getEmpLastName());
			ps.setDate(3, new Date(employee.getDoj().getTime()));
			ps.setDate(4, new Date(employee.getDob().getTime()));
			ps.setFloat(5, employee.getEmpSalary());
			count = ps.executeUpdate();
			if(count == 0) {
				return null;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			dbUtils.closeConnection(con);
		}
		return (count+" records updated");
	}

	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}
}