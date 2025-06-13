package com.example.MyAmazonRibbon;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "sbi-service")
@RibbonClient(name = "sbi-service")
public interface MyAmazonFiegnClient {
	
	@GetMapping("/bookProduct/{price}/{un}/{pw}")
	public String bookProduct(
			@PathVariable("price") int price, @PathVariable("un") String un, 
			@PathVariable("pw") String password);
	

}
