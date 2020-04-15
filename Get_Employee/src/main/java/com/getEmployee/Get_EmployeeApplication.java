package com.getEmployee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Get_EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Get_EmployeeApplication.class, args);
		
	}

}
