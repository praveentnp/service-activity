package com.test.demo.dailyactivity.dao;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import org.springframework.stereotype.Repository;

import com.test.demo.dailyactivity.model.DailyActivity;

@Repository
public interface DailyActivityDAO extends CrudRepository<DailyActivity, Long>
										, PagingAndSortingRepository<DailyActivity, Long>
										, JpaRepository<DailyActivity, Long>{
	

	@Query("SELECT da FROM DailyActivity da WHERE da.psid = ?1 and da.effortSpendDate=?2 ")
	List<DailyActivity> findDailyActivityByPSIDAndEfforSpendDate(Long psid, Timestamp effortSpendDate);

}
