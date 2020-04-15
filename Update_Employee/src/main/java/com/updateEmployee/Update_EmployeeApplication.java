package com.updateEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Update_EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Update_EmployeeApplication.class, args);
	}

}
