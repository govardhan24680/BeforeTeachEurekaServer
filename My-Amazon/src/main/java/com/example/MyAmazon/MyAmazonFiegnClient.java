package com.example.MyAmazon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sbi-service", url = "localhost:8200")
public interface MyAmazonFiegnClient {
	
	@GetMapping("/bookProduct/{price}/{un}/{pw}")
	public String bookProduct(
			@PathVariable("price") int price, @PathVariable("un") String un, 
			@PathVariable("pw") String password);
	

}
