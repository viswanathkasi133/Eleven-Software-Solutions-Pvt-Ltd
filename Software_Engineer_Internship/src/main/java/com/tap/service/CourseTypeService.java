package com.tap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.entity.CourseType;
import com.tap.repository.CourseTypeRepository;

@Service 
public class CourseTypeService { 
	@Autowired 
	private CourseTypeRepository courseTypeRepository;
	public List<CourseType> getAllCourseTypes() {
		return courseTypeRepository.findAll(); 
		} 
	public CourseType saveCourseType(CourseType courseType) { 
		return courseTypeRepository.save(courseType); 
		} 
	public void deleteCourseType(Long id) { 
		courseTypeRepository.deleteById(id);
		} 
	}
