package com.project.Training.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Training.Dao.CompletedTrainingDao;
import com.project.Training.Model.CompletedTraining;

@Service
public class CompletedTrainingServiceImpl implements CompletedTrainingService {

	@Autowired
	CompletedTrainingDao completedTrainingDao;
	
	@Override
	public void create(CompletedTraining training) {
		// TODO Auto-generated method stub
		completedTrainingDao.save(training);
	}

	@Override
	public void update(CompletedTraining training) {
		// TODO Auto-generated method stub
		completedTrainingDao.save(training);

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		completedTrainingDao.deleteById(id);

	}

	@Override
	public List<CompletedTraining> getAll() {
		// TODO Auto-generated method stub
		return completedTrainingDao.findAll();
	}
}
