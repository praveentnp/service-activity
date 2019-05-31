package com.test.demo.activity.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import com.test.demo.activity.dao.ActivityDAO;
import com.test.demo.activity.model.Activity;
import com.test.demo.dailyactivity.model.DailyActivity;


@Component
public class ActivityImpl {
	
	@Autowired
	ActivityDAO activityDao;
	
	public List<Activity> getAllActivity() {
		return (List)activityDao.findAll();
	}
	
	
	public Activity save(Activity activity) {
		return activityDao.save(activity);
	}
	
	public Activity update(Activity activity) {
		return activityDao.save(activity);
	}
	
	
	public List<Activity> searchByRoleId(Activity activity) {
		
		ExampleMatcher matcher = ExampleMatcher.matchingAny()
				.withMatcher("role", match -> match.exact());
		Example<Activity> example = Example.of(activity, matcher);
		
		return (List)activityDao.findAll(example);
	}
	
	public boolean delete(Long id) {
		try {
			activityDao.deleteById(id);
			return true;
		} catch(Exception e) {
			return false;
		}
		
	}

}
