package com.project.Training.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Training.Model.CompletedTraining;

public interface CompletedTrainingDao extends JpaRepository<CompletedTraining, Long> {

}
