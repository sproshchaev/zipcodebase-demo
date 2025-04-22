package com.prosoft.zipcodebase_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ZipcodebaseDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipcodebaseDemoApplication.class, args);

		RestTemplate restTemplate = new RestTemplate();

		String url = "https://app.zipcodebase.com/api/v1/search" +
				"?apikey=YOU_APIKEY" +
				"&codes=625000";

		String response = restTemplate.getForObject(url, String.class);

		System.out.println("API Response:");
		System.out.println(response);

	}

}
