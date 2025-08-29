package com.student.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.student.demo.Repo.CourseRepository;
import com.student.demo.model.Course;

@Service
public class CourseService {
	
@Autowired
CourseRepository courseRepository;

public ResponseEntity<Course> Save(Course course) {
	return  new ResponseEntity<>( courseRepository.save(course), HttpStatus.OK);
}
public List<Course> findAll() {
	return courseRepository.findAll();
}


}
