package com.example.MyAmazonRibbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmazonController {
	
	@Autowired
	MyAmazonFiegnClient myAmazonFiegnClient;
	
	@GetMapping(value = "/getDataFromSbi")
	public String m1() {
		
		return myAmazonFiegnClient.bookProduct(33, "yyy", "hhh");
		
	}
	

}
