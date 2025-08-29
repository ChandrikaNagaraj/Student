package com.student.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
