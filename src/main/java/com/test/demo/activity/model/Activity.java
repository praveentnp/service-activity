package com.test.demo.activity.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.test.demo.dailyactivity.model.DailyActivity;
import com.test.demo.role.model.Role;

@Entity
@Table(name = "ACTIVITY")
public class Activity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id;
 
    @Column(name = "name", nullable = false)
    public String name;
    
    
    @ManyToOne
    @JoinColumn(name = "role_id")
    public Role role;
    
    
    @OneToMany(mappedBy = "activity", cascade = CascadeType.ALL)
    private Set<DailyActivity> dailyActivities;
}
