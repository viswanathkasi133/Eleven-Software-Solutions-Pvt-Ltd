package com.tap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> { 
	
}
