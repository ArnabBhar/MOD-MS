package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Usersignup;
import com.example.demo.services.UsersignupService;
@CrossOrigin(origins ="hhtp://localhost:4200")
@RestController
public class UsersignupController {
	@Autowired
	UsersignupService us;
	
	@RequestMapping(method=RequestMethod.POST,value="/usersignup/go")
	public void postUser(@RequestBody Usersignup u) {
		us.postUser(u);
		
	}

}
 