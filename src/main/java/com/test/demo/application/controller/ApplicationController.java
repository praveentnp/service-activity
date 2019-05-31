package com.test.demo.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.application.impl.ApplicationImpl;
import com.test.demo.application.model.Application;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/application")
public class ApplicationController {
	
	@Autowired
	ApplicationImpl applicationImpl;
	
	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Application> getAllApplications() {
		return applicationImpl.getAllApplication();
	 }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Application save(@RequestBody Application application) {
		return applicationImpl.save(application);		
	}
	
	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Application update(@RequestBody Application application) {
		return applicationImpl.update(application);
	}
	
	
	@PostMapping(path = "/delete")
	public boolean delete(@RequestBody Long id) {
		return applicationImpl.delete(id);
	}

}
