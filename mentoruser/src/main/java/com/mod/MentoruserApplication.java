package com.mod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MentoruserApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentoruserApplication.class, args);
	}

}
