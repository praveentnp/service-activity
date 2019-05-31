package com.test.demo.role.model;

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


@Entity
@Table(name = "ROLE")
public class Role {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Long id;
 
    @Column(name = "role", nullable = false)
    public String role;
    
    
    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private Set<Activity> activities;

}
