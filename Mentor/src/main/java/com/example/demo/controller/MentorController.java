package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.MentorDetails;
import com.example.demo.Entity.MentorSkills;
import com.example.demo.service.MentorDetailsService;
import com.example.demo.service.MentorSkillsService;

@RestController
public class MentorController {

	@Autowired
	private MentorDetailsService mds;
	@Autowired
	private MentorSkillsService mss;
	
	@RequestMapping("/mentordetails")
	public List<MentorDetails> getDetails() {
	return mds.getDetails();
	}
	
	@RequestMapping("/mentordetails/{id}")
	public MentorDetails getDetails(@PathVariable Integer id) {
	return mds.getDetails(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/mentordetails")
	public void addDetails(@RequestBody MentorDetails md) {
		mds.addDetails(md);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/mentordetails/{id}")
	public void updateDetails(@RequestBody MentorDetails md,@PathVariable Integer id) {
		mds.updateDetails(md, id);
		
	}
	@RequestMapping("/skills")
	public List<MentorSkills> getSkills() {
	return mss.getSkills();
	}
	
	@RequestMapping("/skills/{id}")
	public MentorSkills getSkills(@PathVariable Integer id) {
	return mss.getSkills(id);
	}
//	
//	
	@RequestMapping(method=RequestMethod.POST,value="/skills/{id}")
	public void mapSkills(@RequestBody MentorSkills ms,@PathVariable Integer id) {
		mss.setSkills(ms,id);
		
	}

	

}