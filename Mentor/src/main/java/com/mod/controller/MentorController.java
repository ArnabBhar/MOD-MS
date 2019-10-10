package com.mod.controller;


import com.mod.Entity.MentorCalendar;
import com.mod.Entity.MentorSkills;
import com.mod.service.MentorCalendarService;
import com.mod.service.MentorSkillsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableEurekaClient
@CrossOrigin(origins = "http://localhost:4200")
public class MentorController {

	@Autowired
	private MentorSkillsService mss;
	@Autowired
	private MentorCalendarService mcs;
	
	@RequestMapping("/mentorskills/{techId}")
	public List<MentorSkills> getSkills(@PathVariable Integer techId) {
	return mss.getSkills(techId);
	}

	@RequestMapping("/mentorcalendar/{mentor}/{timeslot}")
	public MentorCalendar getCalender(@PathVariable Integer mentor, @PathVariable String timeslot) {
		return mcs.getCalendar(timeslot, mentor);
	}

	@PostMapping(value= "/mentorcalendar/add", produces = MediaType.APPLICATION_JSON_VALUE)
	public void addCalendar(@RequestBody MentorCalendar mc) {
		mcs.addCalendar(mc);
	}

	@PutMapping(value="/mentorcalendar/update")
	public void updateCalendar(@RequestBody MentorCalendar md) {
		mcs.updateCalendar(md);
	}

	@DeleteMapping("/mentorcalendar/delete/{id}")
	public void deleteCalendar(@PathVariable Integer id)
	{
		mcs.deleteCalendar(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/mentorskills/add")
	public void addSkills(@RequestBody MentorSkills ms) {
		mss.addSkills(ms);
	}

	@DeleteMapping("/mentorskills/delete/{id}")
	public void deleteSkills(@PathVariable Integer id)
	{
		mss.deleteSkills(id);
	}

}