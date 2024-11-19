package com.tap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.tap.entity.CourseType;
import com.tap.service.CourseTypeService;

@Controller 
public class CourseTypeController { 
	@Autowired 
	private CourseTypeService courseTypeService;
	@GetMapping("/courseTypes") 
	public String listCourseTypes(Model model) { 
		List<CourseType> courseTypes = courseTypeService.getAllCourseTypes(); 
		model.addAttribute("courseTypes", courseTypes); return "courseTypes"; 
		} 
	@PostMapping("/courseTypes") 
	public String addCourseType(@ModelAttribute CourseType courseType) { 
		courseTypeService.saveCourseType(courseType); 
		return "redirect:/courseTypes"; } 
	@DeleteMapping("/courseTypes/{id}") 
	public String deleteCourseType(@PathVariable Long id) { 
		courseTypeService.deleteCourseType(id); 
		return "redirect:/courseTypes"; } }
