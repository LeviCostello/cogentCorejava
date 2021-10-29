package com.cogent.empspringboot.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //this class will be used for ORM purposes
//@Table(name="emplTable") by default it will take entity name as a table name
//Employee->table name(employee)
public class Employee {

	@Id //Primary Key constraint
	private String empId;
	private String empFirstName;
	private String empLastName;
	private Date doj;
	private Date dob;
	private float empSalary;
}
