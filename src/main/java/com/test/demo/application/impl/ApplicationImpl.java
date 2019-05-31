package com.test.demo.application.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.demo.application.dao.ApplicationDAO;
import com.test.demo.application.model.Application;

@Component
public class ApplicationImpl {
	
	@Autowired
	ApplicationDAO applicationDao;

	public List<Application> getAllApplication() {
		return (List)applicationDao.findAll();
	}
	
	
	public Application save(Application application) {
		return applicationDao.save(application);
	}
	
	public Application update(Application application) {
		return applicationDao.save(application);
	}
	
	public boolean delete(Long id) {
		try {
			applicationDao.deleteById(id);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}
}
