package com.webstack.billing.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.webstack.billing.dto.ProductDTO;

@RestController
@RequestMapping("/api")
public class BillController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/products")
	public List<Object> getAllProducts() {
		ProductDTO[] products = restTemplate.getForObject("http://products-microservices/api/products", ProductDTO[].class);
		return Arrays.asList(products);
	}

}
