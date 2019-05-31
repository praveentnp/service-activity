package com.test.demo.dailyactivity.impl;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Component;

import com.test.demo.dailyactivity.dao.DailyActivityDAO;
import com.test.demo.dailyactivity.model.DailyActivity;
import com.test.demo.role.model.Role;

@Component
public class DailyActivityImpl {
	
	@Autowired
	DailyActivityDAO dailyActivityDao;
	
	
	public List<DailyActivity> getDailyActivities() {
		return (List)dailyActivityDao.findAll();
	}
	
	public DailyActivity save(DailyActivity dailyActivity) {
		return dailyActivityDao.save(dailyActivity);
	}
	
	public DailyActivity update(DailyActivity dailyActivity) {
		return dailyActivityDao.save(dailyActivity);
	}
	
	
	public List<DailyActivity> searchByCriteria(DailyActivity dailyActivity) {
		
		ExampleMatcher matcher = ExampleMatcher.matchingAny()
				.withMatcher("psid", match -> match.exact())
				.withMatcher("effort_spend_date", match -> match.exact());
		
		Example<DailyActivity> example = Example.of(dailyActivity, matcher);
		
		List<DailyActivity> list = (List)dailyActivityDao.findAll(example); 
		return list;
	}
	
	
public List<DailyActivity> findDailyActivityByPSIDAndEfforSpendDate(DailyActivity dailyActivity) {
		
	/*
		ExampleMatcher matcher = ExampleMatcher.matchingAny()
				.withMatcher("psid", match -> match.exact())
				.withMatcher("effort_spend_date", match -> match.exact());
		
		Example<DailyActivity> example = Example.of(dailyActivity, matcher);
		*/
		List<DailyActivity> list = (List)dailyActivityDao.findDailyActivityByPSIDAndEfforSpendDate(dailyActivity.psid, dailyActivity.effortSpendDate); 
		return list;
	}
	
	public boolean delete(Long id) {
		try {
			dailyActivityDao.deleteById(id);
			return true;
		} catch(Exception e) {
			return false;
		}
	}
}
