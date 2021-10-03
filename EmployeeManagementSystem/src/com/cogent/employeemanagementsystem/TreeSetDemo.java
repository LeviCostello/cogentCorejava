package com.cogent.employeemanagementsystem;

import java.util.Comparator;
import java.util.TreeSet;

import com.cogent.employeemanagementsystem.exception.InvalidSalaryException;
import com.cogent.employeemanagementsystem.model.Employee;


public class TreeSetDemo {

	public static void main(String[] args) {
		
		//this is an anonymous class
		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			//the first compare is the root and the second is the one we want to compare it to
			public int compare(Employee o1, Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
		};
		Comparator<Employee> comparator2 = new Comparator<Employee>() {
			@Override
			//the first compare is the root and the second is the one we want to compare it to
			public int compare(Employee o1, Employee o2) {
				return Float.valueOf(o1.getEmpSalary()).compareTo(Float.valueOf(o2.getEmpSalary()));
			}
		};
		
		TreeSet<Employee> employees = new TreeSet<>(comparator);
		//assignment sort by salary but the output is only one employee
		//show all employees even if the salary are the same
		try {
			employees.add(new Employee("ab001", "abhi", "chivate", 100.0f));
			employees.add(new Employee("ab005", "advik", "chivate", 100.0f));
			employees.add(new Employee("ab0010", "abhinandan", "chivate", 100.0f));
			//tree set will not allow null and will throw nullpointer exception
			System.out.println(employees);
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassCastException e) {
			// TODO: handle exception
			System.out.println("Exception Caught"+e);
		}
		
		/*
		 * TreeSet<String> set = new TreeS       et();
		 * 
		 * set.add("abhi"); set.add("howard"); set.add("levi"); set.add("angi");
		 * set.add("omer"); set.add("greg"); set.add("kashif"); set.add("murtaza");
		 * set.add("yuta"); set.add("shaotang"); set.add("anthony");
		 * set.add("akshajyot");
		 * 
		 * System.out.println(set);
		 */
		 
		 
	}

}
