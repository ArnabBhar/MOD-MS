package com.project.Admin;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.project.Training.Model.CurrentTraining;

@RefreshScope
@RestController
public class AdminCurrentTrainingController {

	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/getCurrentTraining")
	public String getProductList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8084/getCurrentTraining", HttpMethod.GET, entity, String.class)
				.getBody();
	}

	
	
	
	
	
	   @PostMapping("currentTraining")
	   public String createProducts(@RequestBody CurrentTraining currentTraining) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<CurrentTraining> entity = new HttpEntity<CurrentTraining>(currentTraining,headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8084/completedTraining", HttpMethod.POST, entity, String.class).getBody();
	   }
	
	
	   
	   @PutMapping("/updateCurrentTraining")
		public String updateProduct(@RequestBody CurrentTraining currentTrainings) {
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<CurrentTraining> entity = new HttpEntity<CurrentTraining>(currentTrainings, headers);

			return restTemplate.exchange("http://localhost:8084/updateCurrentTraining", HttpMethod.PUT, entity, String.class)
					.getBody();
		}
	   
	   
	   
	   
	   @DeleteMapping("/deleteCurrentTraining/{id}")
	   public String deleteProduct(@PathVariable("id") String id) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<CurrentTraining> entity = new HttpEntity<CurrentTraining>(headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8084/deleteCurrentTraining/{id}"+id, HttpMethod.DELETE, entity, String.class).getBody();
	   }
	   
	
	
	
	
	
	
	
	
}
