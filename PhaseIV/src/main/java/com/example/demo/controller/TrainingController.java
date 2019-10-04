package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Training;

import com.example.demo.services.TrainingService;

@RestController
public class TrainingController {
	
	@Autowired
	private TrainingService ts;
	
//	@RequestMapping("/trainer")
//	public List<Training> getTrain() {
// 	return ts.getTrain();
//	}
//	
//	@RequestMapping("/trainer/{id}")
//	public Training getTrain(@PathVariable int id) {
//	return ts.getTrain(id);
//	}
	
	
	@RequestMapping(method=RequestMethod.POST,value="/trainer/{mname}")
	public void addTrain(@RequestBody Training t,@PathVariable String mname) {
		ts.setTraining(t,mname);
		
	}
//	@RequestMapping(method=RequestMethod.PUT,value="/trainer/{id}")
//	public void updateTrain(@RequestBody Training t,@PathVariable int id) {
//		ts.updateTrain(t, id);
//		
//	}
//	@RequestMapping(method=RequestMethod.DELETE,value="/trainer/{id}")
//	public void deleteTrain(@PathVariable int id) {
//		ts.deleteTrain(id);
//		
//	}


}
