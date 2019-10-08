package com.example.demo.service;




import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.MentorDetails;
import com.example.demo.Entity.MentorSkills;
import com.example.demo.Repository.MentorDetailsRepo;
import com.example.demo.Repository.MentorSkillsRepo;
@Service
public class MentorSkillsService {
	

	@Autowired
	private MentorSkillsRepo msr;
	@Autowired
	private MentorDetailsRepo mdr;
	
	public void setSkills(MentorSkills ms, Integer id) {
		MentorDetails md = new MentorDetails();
		md=mdr.findById(id).get();
	ms.setMd(md);
 
	
//		List<MentorSkills> tli = md.getMs();
//		tli.add(ms);
//		md.setMs(tli);
		
		msr.save(ms);
		mdr.save(md);
}
	
	public List<MentorSkills> getSkills() {
		List<MentorSkills> ls=new ArrayList<>();
		msr.findAll().forEach(ls::add);
		return ls;
	}
	
	public MentorSkills getSkills(Integer id) {
		// TODO Auto-generated method stub
		//return ls.stream().filter(t->t.getStateid().equals(id)).findFirst().get();
		return msr.findById(id).orElse(null);
	}

	
	
//	public void addSkills(MentorSkills md) {
//		msr.save(md);
//	}
//	public void updateDetails(MentorDetails md,Integer id) {
//		msr.save(md);
//	}
//	public void deleteDetails(Integer id) {
//		msr.deleteById(id);
//	}


	

}
