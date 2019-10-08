package com.project.User;

import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.User.Service.UserService;
import com.project.User.model.UserDtls;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("*")
@RestController

public class UserController {

	@Autowired
	UserService userService;
	
	
	
	

	@PostMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createUser(@Valid @RequestBody UserDtls newUser) {

		userService.create(newUser);
		// return userDao.save(newUser);

	}

	@GetMapping("/")
	public List<UserDtls> getUsers() {
		return userService.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int id) {
		userService.delete(id);
	}

	@PutMapping("/users")
	public void updateUser(@Valid @RequestBody UserDtls updateUser) {
		userService.update(updateUser);
	}
}
