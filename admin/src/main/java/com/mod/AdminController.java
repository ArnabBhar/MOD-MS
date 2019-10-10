package com.mod;

import com.mod.entity.AdminEntity;
import com.mod.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping(value="/add-admin", produces = MediaType.APPLICATION_JSON_VALUE)
    public void createAdmin(@Valid @RequestBody AdminEntity admin) {
        adminService.create(admin);
    }


    @GetMapping("/admin-list")
    public List<AdminEntity> getAdmin(){
        return adminService.getAll();
    }

}
