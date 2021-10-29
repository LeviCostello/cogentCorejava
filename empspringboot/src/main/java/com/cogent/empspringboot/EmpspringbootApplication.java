package com.cogent.empspringboot;

import java.util.Date;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.empspringboot.dto.Employee;
import com.cogent.empspringboot.service.EmployeeService;

@SpringBootApplication
public class EmpspringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EmpspringbootApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(EmpspringbootApplication.class, args);
		//DataSource dataSource = applicationContext.getBean(DataSource.class);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		//System.out.println(dataSource!=null);
		Employee employee = new Employee("l104", "Big", "Chungus", new Date(), new Date(), 420.69f);
		Optional<Employee> run = employeeService.addEmployee(employee);
		
		if(run.isEmpty()) {
			System.out.println("object not added");
		}
		
		System.out.println(run.get());
	}

}
