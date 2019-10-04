package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.entity.Usersignup;
import com.example.demo.repository.UsersignupRepository;

public class UsersignupService {
	@Autowired UsersignupRepository usr;
	
	public List<Usersignup> getUser() {
		List<Usersignup> u = new ArrayList<Usersignup>();
		usr.findAll().forEach(u::add);
		return u;
	}
	public void postUser(Usersignup u) {
		usr.save(u);
	}
	public Usersignup getUsersUName(String uname) {
		return usr.searchUName(uname);
	}

}
