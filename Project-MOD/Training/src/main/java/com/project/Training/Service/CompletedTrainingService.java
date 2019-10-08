package com.project.Training.Service;

import java.util.List;

import com.project.Training.Model.CompletedTraining;


public interface CompletedTrainingService {

 	void create(CompletedTraining training);
    
    void update(CompletedTraining training);
 
    void delete(long id);
    
//    UserDtl findById(int id);
    
    List<CompletedTraining> getAll();

}
