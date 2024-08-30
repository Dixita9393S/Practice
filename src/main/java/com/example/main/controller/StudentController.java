package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.Student;
import com.example.main.service.StudentService;
@RestController
public class StudentController {
	
	

		@Autowired
		public StudentService studentService;
		
		@PostMapping("/addStudent")
		
		public ResponseEntity<Student> addStudent(@RequestBody Student student){
			
			Student addStudent = studentService.addStudent(student);
			return new ResponseEntity<>(addStudent,HttpStatus.OK);
		}
		
	}


