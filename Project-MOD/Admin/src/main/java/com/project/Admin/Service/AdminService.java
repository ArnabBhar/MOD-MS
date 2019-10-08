package com.project.Admin.Service;


import java.util.List;

import com.project.Admin.Model.Admin;



public interface AdminService {

	void create(Admin admin);
	void update(Admin admin);
	

    List<Admin> getAll();
    
}
