package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mentordetails;
import com.example.demo.repository.MentorRepository;

@Service
public class MentorService {
	
	@Autowired
	private MentorRepository mr;

	public List<Mentordetails> getMentor() {
		List<Mentordetails> li = new ArrayList<>();
		mr.findAll().forEach(li::add);
		return li;
	}

//	public Mentordetails getMentor(int m_id) {
//		// TODO Auto-generated method stub
//		// return ls.stream().filter(t->t.getStateid().equals(id)).findFirst().get();
//		return mr.findById(m_id).orElse(null);
//	}
//
	public void addMentor(Mentordetails md) {
		mr.save(md);
	}
//
//	public void updateMentor(Mentordetails md, int m_id) {
//		mr.save(md);
//	}
//
//	public void deleteMentor(int m_id) {
//		mr.deleteById(m_id);
//	}
//

}
