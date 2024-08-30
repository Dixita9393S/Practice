package com.example.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.main.entity.Student;
import com.example.main.repository.StudentRepository;
import com.example.main.service.StudentService;

public class StudentServiceImp implements StudentService {

	@Autowired
	public StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		Student student1 = studentRepository.save(student);
		return student1;
	}

}

