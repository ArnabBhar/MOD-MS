package com.project.Mentor;

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
import com.project.Training.Model.CompletedTraining;

@RefreshScope
@RestController
public class MentorCompletedTrainingController {

	
	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/getCompletedTraining")
	public String getProductList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8084/getCompletedTraining", HttpMethod.GET, entity, String.class)
				.getBody();
	}

	
	
	
	
	
	   @PostMapping("completedTraining")
	   public String createProducts(@RequestBody CompletedTraining completedTraining) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<CompletedTraining> entity = new HttpEntity<CompletedTraining>(completedTraining,headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8084/completedTraining", HttpMethod.POST, entity, String.class).getBody();
	   }
	
	
	   
	   @PutMapping("/updateCompletedTraining")
		public String updateProduct(@RequestBody CompletedTraining completedTrainings) {
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<CompletedTraining> entity = new HttpEntity<CompletedTraining>(completedTrainings, headers);

			return restTemplate.exchange("http://localhost:8084/updateCompletedTraining", HttpMethod.PUT, entity, String.class)
					.getBody();
		}
	   
	   
	   
	   
	   @DeleteMapping("/deleteCompletedTraining/{id}")
	   public String deleteProduct(@PathVariable("id") String id) {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity<CompletedTraining> entity = new HttpEntity<CompletedTraining>(headers);
	      
	      return restTemplate.exchange(
	         "http://localhost:8084/deleteCompletedTraining/{id}"+id, HttpMethod.DELETE, entity, String.class).getBody();
	   }
	   
	
	
	
	
	
	
	
	
}
