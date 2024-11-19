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

import com.tap.entity.Registration;
import com.tap.service.RegistrationService;

@Controller 
public class RegistrationController { 
	@Autowired 
	private RegistrationService registrationService; 
	@GetMapping("/registrations") 
	public String listRegistrations(Model model) {
		List<Registration> registrations = registrationService.getAllRegistrations(); 
		model.addAttribute("registrations", registrations); return "registrations"; 
		}
	@PostMapping("/registrations") 
	public String addRegistration(@ModelAttribute Registration registration) { 
		registrationService.saveRegistration(registration); return "redirect:/registrations"; 
		}
	@DeleteMapping("/registrations/{id}") 
	public String deleteRegistration(@PathVariable Long id) { 
		registrationService.deleteRegistration(id); return "redirect:/registrations";
	}
}
