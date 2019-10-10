package com.mod;

import com.mod.entity.ActorsEntity;
import com.mod.entity.MentorEntity;
import com.mod.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RefreshScope
@RestController
public class AdminUserController {

	@Autowired
	RestTemplate restTemplate;

	List<UserEntity> user;

	@RequestMapping(value = "/getusers")
	public List<UserEntity> getUser() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

//        return Collections.singletonList(restTemplate.exchange("http://localhost:8201/user/user-list", HttpMethod.GET, entity, UserEntity.class)
//                .getBody());

		ResponseEntity<List<UserEntity>> usersResponse = restTemplate.exchange("http://localhost:8201/user/user-list",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<UserEntity>>() {
				});
		List<UserEntity> users = usersResponse.getBody();
		return users;
	}

	@RequestMapping(value = "/getmentors")
	public List<MentorEntity> getMentor() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<List<MentorEntity>> mentorsResponse = restTemplate.exchange(
				"http://localhost:8201/mentor/mentor-list", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<MentorEntity>>() {
				});
		List<MentorEntity> mentors = mentorsResponse.getBody();
		return mentors;
	}

	@RequestMapping(value = "/block/{accountType}/{name}")
	public Boolean block(@PathVariable String accountType, @PathVariable String name) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ActorsEntity actor = restTemplate.exchange("http://localhost:8201/actordetails/" + accountType + "/" + name,
				HttpMethod.GET, entity, ActorsEntity.class).getBody();
		actor.setActorStatus(false);

		HttpEntity<ActorsEntity> entity1 = new HttpEntity<ActorsEntity>(actor, headers);
		return restTemplate.exchange("http://localhost:8201/block-unblock/" + actor.getId(), HttpMethod.PUT, entity1,
				Boolean.class).getBody();
//            restTemplate.exchange("http://localhost:8201/user/unblock/" + id, HttpMethod.POST, entity, UserEntity.class)
//                    .getBody();
	}

	@RequestMapping(value = "/unblock/{accountType}/{name}")
	public Boolean unblock(@PathVariable String accountType, @PathVariable String name) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ActorsEntity actor = restTemplate.exchange("http://localhost:8201/actordetails/" + accountType + "/" + name,
				HttpMethod.GET, entity, ActorsEntity.class).getBody();
		actor.setActorStatus(true);

		HttpEntity<ActorsEntity> entity1 = new HttpEntity<ActorsEntity>(actor, headers);
		return restTemplate.exchange("http://localhost:8201/block-unblock/" + actor.getId(), HttpMethod.PUT, entity1,
				Boolean.class).getBody();

	}
}
