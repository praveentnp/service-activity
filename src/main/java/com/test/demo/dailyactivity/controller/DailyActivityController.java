package com.test.demo.dailyactivity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.dailyactivity.impl.DailyActivityImpl;
import com.test.demo.dailyactivity.model.DailyActivity;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/daily_activity")
public class DailyActivityController {
	
	@Autowired
	DailyActivityImpl dailyActivityImpl;
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public DailyActivity save(@RequestBody DailyActivity dailyActivity) {
		return dailyActivityImpl.save(dailyActivity);		
	}
	
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public DailyActivity update(@RequestBody DailyActivity dailyActivity) {
		return dailyActivityImpl.update(dailyActivity);
	}
	
	
	@PostMapping(path = "/searchByPSIDAndDate", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<DailyActivity> searchByPSIDAndDate(@RequestBody DailyActivity dailyActivity) {
		return dailyActivityImpl.searchByCriteria(dailyActivity);
	}
	
	
	@PostMapping(path = "/searchByPSIDAndDate1", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<DailyActivity> findDailyActivityByPSIDAndEfforSpendDate(@RequestBody DailyActivity dailyActivity) {
		return dailyActivityImpl.findDailyActivityByPSIDAndEfforSpendDate(dailyActivity);
	}
	
	@PostMapping(path = "/delete")
	public boolean delete(@RequestBody Long id) {
		return dailyActivityImpl.delete(id);
	}

}
