package com.test.demo.application.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.test.demo.activity.model.Activity;
import com.test.demo.dailyactivity.model.DailyActivity;

@Entity
@Table(name = "APPLICATION")
public class Application {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id;
 
    @Column(name = "name", nullable = false)
    public String name;
    
    
    @OneToMany(mappedBy = "application", cascade = CascadeType.ALL)
    private Set<DailyActivity> dailyActivities;

}
