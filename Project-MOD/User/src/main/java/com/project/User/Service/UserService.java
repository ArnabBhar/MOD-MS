package com.project.User.Service;

import java.util.List;

import com.project.User.model.UserDtls;

public interface UserService {

	 	void create(UserDtls user);
	    
	    void update(UserDtls user);
	 
	    void delete(long id);
	    
//	    UserDtl findById(int id);
	    
	    List<UserDtls> getAll();
	
}
