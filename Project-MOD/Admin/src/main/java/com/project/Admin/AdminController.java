package com.project.Admin;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Admin.Model.Admin;
import com.project.Admin.Service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	
		
@PostMapping(value="/adminHome", produces = MediaType.APPLICATION_JSON_VALUE)
	public void createAdmin(@Valid @RequestBody Admin newAdmin) {
	adminService.create(newAdmin);
}
	
@PutMapping("/adminHome")
public void updateAdmin(@Valid @RequestBody Admin updateAdmin)
{
	adminService.update(updateAdmin);
}

@GetMapping("/")
public List<Admin> getAdmin(){
	return adminService.getAll();
}
}
