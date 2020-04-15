package com.fetchAll_Employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FetchAll_EmployeesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FetchAll_EmployeesApplication.class, args);
	}

}
