package com.tap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.entity.Course;
import com.tap.repository.CourseRepository;

@Service 
public class CourseService { 
	@Autowired 
	private CourseRepository courseRepository; 
	public List<Course> getAllCourses() { 
		return courseRepository.findAll(); 
		} 
	public Course saveCourse(Course course) { 
		return courseRepository.save(course); 
		} 
	public void deleteCourse(Long id) { 
		courseRepository.deleteById(id); 
		} 
	}