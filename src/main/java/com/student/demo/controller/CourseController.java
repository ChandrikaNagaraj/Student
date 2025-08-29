package com.student.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.demo.Service.CourseService;
import com.student.demo.model.Course;

@RestController
@RequestMapping("/Course")
public class CourseController {

	@Autowired
	CourseService courseService;

	@PostMapping("/saveCourse")
	public ResponseEntity<Course> save(@RequestBody Course course) {
		return courseService.Save(course);
	}
	
	@GetMapping("getAll")
	public List<Course> getAll() {
		return courseService.findAll();
		
	}

}
