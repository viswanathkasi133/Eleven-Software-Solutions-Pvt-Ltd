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

import com.tap.entity.Course;
import com.tap.service.CourseService;

@Controller 
public class CourseController { 
	@Autowired 
	private CourseService courseService; 
	@GetMapping("/courses") 
	public String listCourses(Model model) { 
		List<Course> courses = courseService.getAllCourses(); 
		model.addAttribute("courses", courses); 
		return "courses"; 
		}
	@PostMapping("/courses") 
	public String addCourse(@ModelAttribute Course course) { 
		courseService.saveCourse(course); return "redirect:/courses"; 
		}
	@DeleteMapping("/courses/{id}") 
	public String deleteCourse(@PathVariable Long id) { 
		courseService.deleteCourse(id); return "redirect:/courses"; 
		}
	}