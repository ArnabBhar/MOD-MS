package com.mod.Service;

import com.mod.Entity.UserEntity;
import java.util.ArrayList;
import java.util.List;

import com.mod.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;

	public List<UserEntity> getUser() {
		List<UserEntity> ls = new ArrayList<>();
		ur.findAll().forEach(ls::add);
		return ls;
	}

	public UserEntity getUser(Integer id) {
		// return ls.stream().filter(t->t.getStateid().equals(id)).findFirst().get();
		return ur.findById(id).orElse(null);
	}

	public void addUser(UserEntity s) {

		ur.save(s);
	}

	public void updateUser(UserEntity s, Integer id) {
		ur.save(s);
	}

	public void deleteUser(Integer id) {
		ur.deleteById(id);
	}

}
