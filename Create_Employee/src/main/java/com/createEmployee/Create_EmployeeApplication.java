package com.createEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Create_EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Create_EmployeeApplication.class, args);
	}

}
