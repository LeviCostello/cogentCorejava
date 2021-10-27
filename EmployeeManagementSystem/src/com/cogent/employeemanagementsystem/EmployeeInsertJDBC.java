package com.cogent.employeemanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeInsertJDBC {
//Write a JDBC app to get empNo, empName, job, salary column values from emp database table based on 
//    3 jobs order by job

	public static void main(String[] args) throws Exception {
		Scanner sc = null;
		int sno = 0;
		String name = null, addrs=null;
		float avg=0.0f;
		Connection con = null;
		Statement st = null;
		String query = null;
		int count = 0;
		
		try {
			sc = new Scanner(System.in);
			if(sc!=null) {
				System.out.println("Enter Student number::");
				sno = sc.nextInt();
				System.out.println("Enter Student name::");
				name = sc.next();
				System.out.println("Enter Student address::");
				addrs = sc.next();
				System.out.println("Enter Student avg::");
				avg=sc.nextFloat();
			}
				name = "'"+name+"'";
				addrs = "'"+addrs+"'";
				
				//for JDBC 4 version or jdk6 or jdk1.6 version or java 6
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//establish connection
				con = DriverManager.getConnection("jbdc:mysql://localhost:3306/employeedb","root","root");
				
				System.out.println(con.getClass().getName()); //com.mysql.cj.jdbc.connectionIMPL
				
				//create Statement Object
				if(con!=null) {
					st = con.createStatement();
				}
				
				//prepare SQL query andinsert student values
				//these nmber of row inserted or
				query = "INSERT INTO productcrud.student VALUES("+sno+","+name+","+addrs+","+avg+")";
				System.out.println(query);
				
				//send and execute sql query in DB s/w
				if(st!=null)
					count = st.executeUpdate(query);
				
				//process
				
				if(count==0)
					System.out.println("Record not inserted");
				else
					System.out.println("Record inserted:" + count);
		}
		catch(Exception e){
			e.printStackTrace();

			}
			finally{
			 // close jdbc objects

			try{
			  if(st!=null)
			 st.close();

			}
			catch(SQLException se){
			se.printStackTrace();


			try{
			  if(con!=null)
			 con.close();

			}
			catch(SQLException se1){
			se1.printStackTrace();

			}

			try{
			  if(sc!=null)
			 sc.close();

			}
			catch(Exception e){
			e.printStackTrace();

			}
			}// finally
		}// main
	}// class

}
