package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mentordetails;
import com.example.demo.services.MentorService;

@RestController
public class MentorController {

	@Autowired
	private MentorService ms;
	
//	@RequestMapping("/mentor")
//	public List< Mentordetails> getMentor() {
// 	return ms.getMentor();
//	}
//	
//	@RequestMapping("/mentor/{m_ id}")
//	public Mentordetails getMentor(@PathVariable int m_id) {
//	return ms.getMentor(m_id);
//	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/mentor")
	public void addMentor(@RequestBody Mentordetails md) {
		ms.addMentor(md);
		
	}
//	@RequestMapping(method=RequestMethod.PUT,value="/mentor/{m_id}")
//	public void updateMentor(@RequestBody Mentordetails md,@PathVariable int m_id) {
//		ms.updateMentor(md, m_id);
//		
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/mentor/{m_id}")
//	public void deleteMentor(@PathVariable int m_id) {
//		ms.deleteMentor(m_id);
//		
//	}


}
