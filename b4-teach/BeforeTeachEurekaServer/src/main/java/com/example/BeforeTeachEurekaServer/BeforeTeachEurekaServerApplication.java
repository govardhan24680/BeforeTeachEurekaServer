package com.example.BeforeTeachEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BeforeTeachEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeforeTeachEurekaServerApplication.class, args);
	}

}
