package com.photoapp.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoAppAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppAccountManagementApplication.class, args);
	}

}
