package com.project.User.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.User.model.UserDtls;

public interface UserDao extends JpaRepository<UserDtls, Long> {

}
