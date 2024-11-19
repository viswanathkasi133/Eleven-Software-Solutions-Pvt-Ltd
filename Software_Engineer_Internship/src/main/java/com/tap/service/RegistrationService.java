package com.tap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tap.entity.Registration;
import com.tap.repository.RegistrationRepository;

@Service 
public class RegistrationService {
	@Autowired 
	private RegistrationRepository registrationRepository;
	public List<Registration> getAllRegistrations() { 
		return registrationRepository.findAll(); 
		} 
	public Registration saveRegistration(Registration registration) { 
		return registrationRepository.save(registration);
		}
	public void deleteRegistration(Long id) {
		registrationRepository.deleteById(id);
	} 
	}
