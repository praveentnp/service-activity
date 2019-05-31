package com.test.demo.application.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.application.model.Application;

@Repository
public interface ApplicationDAO extends CrudRepository<Application, Long>{

}
