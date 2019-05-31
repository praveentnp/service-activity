package com.test.demo.role.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.role.impl.RoleImpl;
import com.test.demo.role.model.Role;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleImpl roleImpl;
	
	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Role> getAllRoles() {
		return  roleImpl.getAllRole();
	 }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Role save(@RequestBody Role role) {
		return roleImpl.save(role);		
	}
	
	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Role update(@RequestBody Role role) {
		return roleImpl.update(role);
	}
	
	
	@PostMapping(path = "/delete")
	public boolean delete(@RequestBody Long id) {
		return roleImpl.delete(id);
	}
	
}
