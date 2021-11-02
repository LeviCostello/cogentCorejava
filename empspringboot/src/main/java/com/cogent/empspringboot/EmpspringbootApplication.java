package com.cogent.empspringboot;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.empspringboot.dto.Employee;
import com.cogent.empspringboot.onetoone.Address;
import com.cogent.empspringboot.onetoone.Student;
import com.cogent.empspringboot.service.EmployeeService;

@SpringBootApplication
public class EmpspringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EmpspringbootApplication.class, args);
		ApplicationContext applicationContext = SpringApplication.run(EmpspringbootApplication.class, args);
		//DataSource dataSource = applicationContext.getBean(DataSource.class);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		//System.out.println(dataSource!=null);
//		Employee employee = new Employee("l104", "Big", "Chungus", new Date(), new Date(), 420.69f);
//		Employee employee2 = new Employee("l104", "Ligma", "Candice", new Date(), new Date(), 12.49f);
//;
//		Optional<Employee> run = employeeService.addEmployee(employee);
//		Optional<Employee> run2 = employeeService.getEmployeeById("l104");
//		List<Employee> run3 = employeeService.getEmployees();
//		Optional<Employee> run4 = employeeService.updateEmployee(employee2);
//		Boolean exist = employeeService.isEmployeeExists("l104");
//		
//		
//		if(run.isEmpty()) {
//			System.out.println("object not added");
//		}
//		
//		System.out.println("add employee"+run.get());
//		System.out.println(run2.get());
//		System.out.println(run3);
//		System.out.println(run4.get());
//		employeeService.deleteEmployeeById("l104");
//		System.out.println("l104"+exist);
//		System.out.println(run3);
//		//employeeService.deleteAllEmployees();
		
		//////////////////////////////////////////////////////
		Student ses = applicationContext.getBean(Student.class);
		
		Address address1 = new Address(1011L,"OMR Road", 
				"Chennai", "TN", "600097");
		Address address2 = new Address(1021L,"Ring Road",
				"Banglore", "Karnataka", "560000");
		Student student1 = new Student(111L,"Eswar", address1);
		Student student2 = new Student(211L,"Joe", address2);
		ses.save(address1);
		ses.save(address2);
		ses.save(student1);
		ses.save(student2);
		
		
		
	}

}
