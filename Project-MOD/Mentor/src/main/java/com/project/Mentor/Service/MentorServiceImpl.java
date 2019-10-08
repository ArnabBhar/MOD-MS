package com.project.Mentor.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Mentor.Dao.MentorDetailDao;
import com.project.Mentor.Model.MentorDetail;

@Service
public class MentorServiceImpl implements MentorService {

	@Autowired 
	MentorDetailDao mentorDetailDao;
	
	@Override
	public void create(MentorDetail mentor) {
		// TODO Auto-generated method stub
		 mentorDetailDao.save(mentor);
	}

	@Override
	public void update(MentorDetail mentor) {
		// TODO Auto-generated method stub
		mentorDetailDao.save(mentor);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		mentorDetailDao.deleteById(id);
	}

	@Override
	public List<MentorDetail> getAll() {
		// TODO Auto-generated method stub
		return mentorDetailDao.findAll();
	}

}
