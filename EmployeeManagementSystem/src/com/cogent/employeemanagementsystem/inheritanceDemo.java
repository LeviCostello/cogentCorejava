package com.cogent.employeemanagementsystem;

import com.cogent.employeemanagementsystem.model.Employee;
import com.cogent.employeemanagementsystem.model.Manager;
import com.cogent.employeemanagementsystem.model.ProjectManager;

public class inheritanceDemo {
	                          
	public static final float PI = 3.14f;
	//static: only one copy
	//final: can't change the value
	public final int a;
	public int b;
	public inheritanceDemo() {
		//empty final field needs to be initialized in the constructor
		this.a = 0;
	}
	
	public static final void main(String[] args) {
		final int b = 100;
		System.out.println("hello from abhi "+b);
//		//Manager manager = new Manager("ab001", "abhi", "chivate",1200.f,123,"PA");
//		
//		//Parent type   : Child Type
//		Employee manager = new Manager();
//		//the object will behave like the parent
//		System.out.println("emp id " + manager.getEmpSalary());
//		
//		float salary = manager.calculateSalary();
//		
//		System.out.println(salary);
//		System.out.println(manager.calculateSalary());
//		
//		Manager manager2 = (Manager) manager;
//		System.out.println(manager2.getProjectAllow());
//		
//		ProjectManager pm = new ProjectManager();
//		//E + M + PM
//		Manager pm = new ProjectManager();
//		//E + M
//		Employee pm = new ProjectManager();
//		//E
	}

}
