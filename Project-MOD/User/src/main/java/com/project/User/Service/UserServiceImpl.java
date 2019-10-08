package com.project.User.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.User.Dao.UserDao;
import com.project.User.model.UserDtls;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public void create(UserDtls user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Override
	public void update(UserDtls user) {
		// TODO Auto-generated method stub
		userDao.save(user);

	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		userDao.deleteById(id);

	}

	@Override
	public List<UserDtls> getAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

}
