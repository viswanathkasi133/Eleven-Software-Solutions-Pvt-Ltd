package com.tap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tap.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Long> { 
	
}