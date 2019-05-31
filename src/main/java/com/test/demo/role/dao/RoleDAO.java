package com.test.demo.role.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.role.model.Role;

@Repository
public interface RoleDAO extends CrudRepository<Role, Long>{

	
}
