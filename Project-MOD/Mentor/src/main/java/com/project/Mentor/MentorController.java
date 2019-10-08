package com.project.Mentor;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.Mentor.Dao.MentorDetailDao;
import com.project.Mentor.Dao.MentorSkillsDao;
import com.project.Mentor.Model.MentorDetail;
import com.project.Mentor.Service.MentorService;

@RestController
public class MentorController {

	@Autowired
	MentorDetailDao mentorSkillDao;
	
	@Autowired
	MentorSkillsDao mentorSkillsDao;
	
	@Autowired
	MentorService mentorService;
	


	@PostMapping(value= "/mentors", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createUser(@Valid @RequestBody MentorDetail newMentor)
	{
		
		
			mentorService.create(newMentor);
	}
	
	@PutMapping("/mentors")
	public void updateUser(@Valid @RequestBody MentorDetail updateUser) {
		mentorService.update(updateUser);
	}
	
	@DeleteMapping("/{id}")
public void deleteUser(@PathVariable("id") long id)
	{
		mentorService.delete(id);
	}
	
	
	@GetMapping("/")
	public List<MentorDetail> getMentor() {
	mentorService.create(new MentorDetail(1l, "ds"));
		return mentorService.getAll();
	}
	
	
}
