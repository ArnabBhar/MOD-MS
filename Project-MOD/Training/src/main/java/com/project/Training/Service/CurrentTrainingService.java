package com.project.Training.Service;

import java.util.List;

import com.project.Training.Model.CurrentTraining;



public interface CurrentTrainingService {

 	void create(CurrentTraining training);
    
    void update(CurrentTraining training);
 
    void delete(long id);
    
//    UserDtl findById(int id);
    
    List<CurrentTraining> getAll();

}
