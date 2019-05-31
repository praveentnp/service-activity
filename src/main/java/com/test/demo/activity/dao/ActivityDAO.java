package com.test.demo.activity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.activity.model.Activity;

@Repository
public interface ActivityDAO extends CrudRepository<Activity, Long>, JpaRepository<Activity, Long> {

}
