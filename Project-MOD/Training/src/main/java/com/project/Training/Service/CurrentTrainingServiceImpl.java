package com.project.Training.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Training.Dao.CompletedTrainingDao;
import com.project.Training.Dao.CurrentTrainingDao;
import com.project.Training.Model.CompletedTraining;
import com.project.Training.Model.CurrentTraining;

@Service
public class CurrentTrainingServiceImpl implements CurrentTrainingService {

	@Autowired
	CurrentTrainingDao currentTrainingDao;
	
	@Override
	public void create(CurrentTraining training) {
		// TODO Auto-generated method stub
		currentTrainingDao.save(training);
	}

	@Override
	public void update(CurrentTraining training) {
		// TODO Auto-generated method stub
		currentTrainingDao.save(training);

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		currentTrainingDao.deleteById(id);

	}

	@Override
	public List<CurrentTraining> getAll() {
		// TODO Auto-generated method stub
		return currentTrainingDao.findAll();
	}
}
