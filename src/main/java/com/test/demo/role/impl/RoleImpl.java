package com.test.demo.role.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.demo.role.dao.RoleDAO;
import com.test.demo.role.model.Role;

@Component
public class RoleImpl {

	@Autowired
	RoleDAO roleDao;
	
	public List<Role> getAllRole() {
		return (List)roleDao.findAll();
	}
	
	
	public Role save(Role role) {
		return roleDao.save(role);
	}
	
	public Role update(Role role) {
		return roleDao.save(role);
	}
	
	public boolean delete(Long id) {
		try {
			roleDao.deleteById(id);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}
}
