package com.mod.Controller;

import com.mod.Entity.UserEntity;
import com.mod.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

	@Autowired
	private UserService us;

	@RequestMapping("/user")
	public List<UserEntity> getUser() {
		return us.getUser();
	}

	@RequestMapping("/user/{id}")
	public UserEntity getUser(@PathVariable Integer id) {
		return us.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/user/signup")
	public void addUser(@RequestBody UserEntity a) {
		us.addUser(a);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
	public void updateUser(@RequestBody UserEntity a, @PathVariable Integer id) {
		us.updateUser(a, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteUser(@PathVariable Integer id) {
		us.deleteUser(id);
	}
}
