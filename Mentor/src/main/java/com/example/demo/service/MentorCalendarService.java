package com.example.demo.service;

import com.example.demo.Entity.MentorCalendar;
import com.example.demo.Entity.MentorDetails;
import com.example.demo.Repository.MentorCalendarRepo;
import com.example.demo.Repository.MentorDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MentorCalendarService {
    @Autowired
    private MentorCalendarRepo mcr;
    @Autowired
    private MentorDetailsRepo mdr;

    public void setCalendar(MentorCalendar mc, Integer id){
        MentorDetails md = new MentorDetails();
        md=mdr.findById(id).get();
        mc.setMd(md);
        mcr.save(mc);
        mdr.save(md);
    }

    public List<MentorCalendar> getCalendar() {
        List<MentorCalendar> ls=new ArrayList<>();
        mcr.findAll().forEach(ls::add);
        return ls;
    }

    public MentorCalendar getCalendar(Integer id) {
        return mcr.findById(id).orElse(null);
    }



	public void addCalendar(MentorCalendar mc) {
		mcr.save(mc);
	}
	public void updateCalendar(MentorCalendar md,Integer id) {
		mcr.save(md);
	}
	public void deleteCalendar(Integer id) {
		mcr.deleteById(id);
	}
}
