package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.MentorDetails;
import com.example.demo.Repository.MentorDetailsRepo;
@Service
public class MentorDetailsService {
	

	@Autowired
	private MentorDetailsRepo mdr;
	
	public List<MentorDetails> getDetails() {
		List<MentorDetails> ls=new ArrayList<>();
		mdr.findAll().forEach(ls::add);
		return ls;
	}
	
	public MentorDetails getDetails(Integer id) {
		// TODO Auto-generated method stub
		//return ls.stream().filter(t->t.getStateid().equals(id)).findFirst().get();
		return mdr.findById(id).orElse(null);
	}
	
	public void addDetails(MentorDetails md) {
		mdr.save(md);
	}
	public void updateDetails(MentorDetails md,Integer id) {
		mdr.save(md);
	}
	public void deleteDetails(Integer id) {
		mdr.deleteById(id);
	}


	

}
