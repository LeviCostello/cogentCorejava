package com.cogent.employeemanagementsystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import com.cogent.employeemanagementsystem.exception.IdNotFoundException;
import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.service.EmployeeService;
import com.cogent.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main2 {
	
	public static int division(int a, int b) {
		int c = 0;
		try {
			c = a / b;//it will return an object of arithmetic exception
			//JVM will create the objects for all pre defined runtime exceptions
			return c; //if division is done then return the result
		} catch (ArithmeticException e) {
			
		} finally {
			//before executing the return statement it will go to the finally block and execute
			//it and then it will return the value to caller
			System.out.println("After Catch Block");//finally block code
		}
		
		return -1;
		
	}
	
//	public int tryCatchExamples(int a, int b) {
//		try {
//			
//		}catch() {
//			
//		}
//		
//		/////////////////////////////
//		try {
//			
//		}catch() {
//			
//		}catch() {
//			
//		}catch() {
//			
//		}
//		///////////////////////////////
//		try {
//			
//		}finally {
//			
//		}
//		///////////////////////////////
//		try {
//			
//		} catch () {
//		
//		} finally {
//			
//		}
//		///////////////////////////////
//		try {
//			
//		} catch () {
//		
//		} catch () {
//			
//		} catch () {
//			
//		} finally {
//			
//		}
//			
//	}

	public static void main(String[] args) throws IdNotFoundException, IOException, InvalidSalaryException {
		
		Employee employee = new Employee("ab001", "abhi", "chivate", 123.0f);
		employee.setEmpSalary(-500.0f);
		
		/////////////////////////////////////////////////////////////////////////
		//EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		//Employee employee = employeeService.getEmployeeById("abc.txt");
		//this will terminate the execution because it went from check exception to unchecked 
		//exception
		
		///////////////////////////////////////////////////////////////
//		try {
//			FileOutputStream fileOutPutStream = new FileOutputStream("abc.txt");
//			fileOutPutStream.write("ABC".getBytes());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		//will terminate execution because it went from check exception to unchecked exception
		//if throws used inside main it terminates execution 
		//if you want to continue execution is better to use try catch method
		
////////////////////////////////////////////////////////////////		
//		try {
//			System.out.println(10/5);
//			String s = null;
//			System.out.println(s.concat("abhi"));
//			//s is not refering to object
//			//to call concat method we need object
//			//since object is not there and we are trying to call concat method
//			//then it wil throw NPE.
//		}catch (ArithmeticException e) {
//			// TODO: handle exception
//		} catch (NullPointerException e) {
//			// TODO: handle exception
//		} catch (RuntimeException e) {
//			// TODO: handle exception
//		}
//		catch (Exception e) { //exception is the at the top in the hiegherarchy for exceptions
//			System.out.println("Exception Caught");
//			System.out.println(e.getClass().getName());
//		} catch (Throwable e) {
//			// TODO: handle exception
//		}//why no for object if object is able to handle it then every class is capable to
//		//handle the exception
//		//then what is difference between a normal class and exceptional class?
//		catch (Object e) {
//			// TODO: handle exception
//		}
		//catch(ArithmeticException e) {
//			
//		} catch(NullPointerException e) {
//			System.out.println("Caught NPE");
//		}
//////////////////////////////////////////////////////////////////////////////////////////		
//		int result = division(10,5);
//		System.out.println(result);
//		Scanner scan = new Scanner(System.in);
//		//in ==> static Ref ==> used in className
//		
//		//it is used to accept value/data from user
//		int c = 0, a = 0, b = 0;
//		try {
//			System.out.println("Enter the data");
//			a = scan.nextInt();
//			b = scan.nextInt();
//			System.out.println(a +" "+ b);
//			c = a / b;
//		} catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//			System.out.println("exception occured: enter b data again");
//			b = scan.nextInt();
//			c = a / b;
//		} finally {
//			System.out.println("Finally block");
//		}
//		//if b is 0 then its a arithmetic runtime error
//		
//		System.out.println("division is "+ c);
	}

}
