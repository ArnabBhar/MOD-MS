package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Mentordetails;
import com.example.demo.entity.Training;
import com.example.demo.repository.MentorRepository;
import com.example.demo.repository.Trainingrepository;

@Service
public class TrainingService {
	
	@Autowired
	private Trainingrepository tr;
	@Autowired
	private MentorRepository mr;
	
	public void setTraining(Training t, String username) {
	 
	Mentordetails md = new Mentordetails();
		md=mr.findById(username).get();
	
 
	
		List<Training> tli = md.getTli();
		tli.add(t);
		md.setTli(tli);
		
		tr.save(t);
		mr.save(md);
}

//	public Training getTrain(int id) {
//		// TODO Auto-generated method stub
//		// return ls.stream().filter(t->t.getStateid().equals(id)).findFirst().get();
//		return tr.findById(id).orElse(null);
//	}
//
//	public void addTrain(Training t) {
//		tr.save(t);
//	}
//
//	public void updateTrain(Training t, int id) {
//		tr.save(t);
//	}
//
//	public void deleteTrain(int id) {
//		tr.deleteById(id);
//	}
//

}
