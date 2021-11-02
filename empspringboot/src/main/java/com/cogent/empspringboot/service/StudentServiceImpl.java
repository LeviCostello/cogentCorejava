package com.cogent.empspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.empspringboot.onetoone.Student;
import com.cogent.empspringboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	public void addStudent(Student student) {
		studentRepositoy.save(student);
	}
}
