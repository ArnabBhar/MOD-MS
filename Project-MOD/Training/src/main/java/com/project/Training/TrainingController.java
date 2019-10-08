package com.project.Training;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Training.Model.CompletedTraining;
import com.project.Training.Model.CurrentTraining;
import com.project.Training.Service.CompletedTrainingService;
import com.project.Training.Service.CurrentTrainingService;


@EnableEurekaClient
@RestController
//@RequestMapping("/training")
public class TrainingController {

	@Autowired
	CurrentTrainingService currentTrainingService;
	
	@Autowired
	CompletedTrainingService completedTrainingService;
	
	@PostMapping(value = "/currentTraining", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createTraining(@Valid @RequestBody CurrentTraining newTraining) {

		currentTrainingService.create(newTraining);
	}
	@PostMapping(value = "/completedTraining", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createCompTraining(@Valid @RequestBody CompletedTraining newTraining) {

		completedTrainingService.create(newTraining);
	}
	@GetMapping("/getCurrentTraining")
	public List<CurrentTraining> getTraining() {
		return currentTrainingService.getAll();
	}
	@GetMapping("/getCompletedTraining")
	public List<CompletedTraining> getCompTraining() {
		return completedTrainingService.getAll();
	}
	@DeleteMapping("/deleteCurrentTraining/{id}")
	public void deleteTraining(@PathVariable("id") Long id) {
		currentTrainingService.delete(id);
	}
	@DeleteMapping("/deleteCompletedTraining/{id}")
	public void deleteCompTraining(@PathVariable("id") Long id) {
		completedTrainingService.delete(id);
	}
	@PutMapping("/updateCurrentTraining")
	public void updateTraining(@Valid @RequestBody CurrentTraining updateTraining) {
		currentTrainingService.update(updateTraining);
	}
	@PutMapping("/updateCompletedTraining")
	public void updateCompTraining(@Valid @RequestBody CompletedTraining updateTraining) {
		completedTrainingService.update(updateTraining);
	}
	
}
