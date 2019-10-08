package com.project.Admin.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Admin.Model.Admin;

public interface AdminDao extends JpaRepository<Admin, Long> {

}
