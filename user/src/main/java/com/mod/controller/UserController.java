package com.mod.controller;

import com.mod.entity.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RefreshScope
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/user/technologies")
    public List<Technology> getTechnologies() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<List<Technology>> technologyResponse =
                restTemplate.exchange("http://localhost:8203/technology/list-tech",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Technology>>() {
                        });
        List<Technology> technologies = technologyResponse.getBody();
        return technologies;
    }
}
