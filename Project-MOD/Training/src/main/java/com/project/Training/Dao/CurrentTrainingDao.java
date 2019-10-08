package com.project.Training.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Training.Model.CurrentTraining;

public interface CurrentTrainingDao extends JpaRepository<CurrentTraining, Long> {

}
