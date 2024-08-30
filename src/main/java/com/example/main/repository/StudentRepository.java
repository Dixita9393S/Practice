package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
