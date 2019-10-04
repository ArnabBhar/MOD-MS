package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Usersignup;

public interface UsersignupRepository extends CrudRepository<Usersignup,String>{
	@Query(value="select * from usersignup s where s.email=?1 ",nativeQuery = true)
	Usersignup searchUName(String uname);
}
