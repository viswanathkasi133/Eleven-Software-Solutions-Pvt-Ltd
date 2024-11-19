package com.tap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.entity.CourseType;

public interface CourseTypeRepository extends JpaRepository<CourseType, Long> {
	
}
