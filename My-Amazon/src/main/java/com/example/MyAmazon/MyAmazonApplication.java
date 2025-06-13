package com.example.MyAmazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.MyAmazon")
public class MyAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyAmazonApplication.class, args);
	}

}
