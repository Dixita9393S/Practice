package com.example.main.serviceimpl;

public class StudentServiceImp implements StudentService {

	@Autowired
	public StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student student) {
		Student student1 = studentRepository.save(student);
		return student1;
	}
}