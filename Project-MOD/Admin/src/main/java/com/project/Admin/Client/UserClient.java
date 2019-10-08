package com.project.Admin.Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;



@FeignClient("User")
public interface UserClient {

	
	@RequestMapping("/user")
	public String Users();
}
