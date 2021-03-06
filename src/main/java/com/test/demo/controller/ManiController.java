package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.dao.PersonDAO;
import com.test.demo.entity.Person;

@RestController
public class ManiController {
	
	@Autowired
    private PersonDAO personDAO;
 
    @ResponseBody
    @RequestMapping("/")
    public String index() {
        Iterable<Person> all = personDAO.findAll();
 
        StringBuilder sb = new StringBuilder();
 
        all.forEach(p -> sb.append(p.getFullName() + "<br>"));
 
        return sb.toString();
    }

}
