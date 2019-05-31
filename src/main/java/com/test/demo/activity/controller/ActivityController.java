package com.test.demo.activity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.activity.impl.ActivityImpl;
import com.test.demo.activity.model.Activity;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/activity")
public class ActivityController {
	
	@Autowired
	ActivityImpl activityImpl;
	
	
	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Activity> getAllActivites() {
		return  activityImpl.getAllActivity();
	 }
	
	
	@PostMapping(path = "/searchByRoleId", produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<Activity> searchByRoleId(@RequestBody Activity activity) {
		List<Activity> activityList = activityImpl.searchByRoleId(activity);
		System.out.println("---->"+activityList);
		return activityList;
	 }
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public Activity save(@RequestBody Activity activity) {
		return activityImpl.save(activity);		
	}
	
	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Activity update(@RequestBody Activity activity) {
		return activityImpl.update(activity);
	}
	
	
	@PostMapping(path = "/delete")
	public boolean delete(@RequestBody Long id) {
		return activityImpl.delete(id);
	}

}
