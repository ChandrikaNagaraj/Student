package com.student.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.demo.model.Course;


public interface  CourseRepository  extends JpaRepository<Course, Integer>{

}
