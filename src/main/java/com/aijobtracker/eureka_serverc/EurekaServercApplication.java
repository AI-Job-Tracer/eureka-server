package com.aijobtracker.eureka_serverc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServercApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServercApplication.class, args);
	}

}
