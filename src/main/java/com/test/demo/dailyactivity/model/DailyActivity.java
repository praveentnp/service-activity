package com.test.demo.dailyactivity.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.test.demo.activity.model.Activity;
import com.test.demo.application.model.Application;
import com.test.demo.role.model.Role;

@Entity
@Table(name = "DAILY_ACTIVITY")
public class DailyActivity {
	/*
	id	int
	psid	int
	application_id	int
	activity_id	int
	activity_desc	String
	effort_spend_time	float
	effort_spend_date	date
	effort_entry_date	date
*/
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id;
 
    @Column(name = "psid", nullable = false)
    public Long psid;
    
    
    @ManyToOne
    @JoinColumn(name = "fk_application_id")
    public Application application;
    
    /*
    @Column(name = "fk_application_id", nullable = false)
    public Long fkApplicationId;
    */
    
    @ManyToOne
    @JoinColumn(name = "fk_activity_id")
    public 	Activity activity;
    
    
    /*
    @Column(name = "fk_activity_id", nullable = false)
    public Long fkActivityId;
    */
    
    
    @Column(name = "activity_desc")
    public String activityDesc;
    
    @Column(name = "effort_spend_time", nullable = false)
    public Long effortSpendTime;
    
    @Column(name = "effort_spend_date", nullable = false)
    public Timestamp effortSpendDate;
    
    @Column(name = "effort_entry_date", nullable = false)
    public Timestamp effortEntryDate;
    
    
    
    
}
