package com.webstack.products.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.products.dto.ProductDTO;

@RestController
@RequestMapping("/api")
public class ProductController {

	
	@GetMapping("/products")
	public List<ProductDTO> productList() {
		
		List<ProductDTO> products = new ArrayList<ProductDTO>();
		
		ProductDTO product1 = new ProductDTO();
		product1.setId(11);
		product1.setName("TEA");
		product1.setDescription("Mashala Tea");
		product1.setPrice(10.0);
		
		ProductDTO product2 = new ProductDTO();
		product2.setId(22);
		product2.setName("COFFEE");
		product2.setDescription("Cold Coffee");
		product2.setPrice(20.0);
	
		ProductDTO product3 = new ProductDTO();
		product3.setId(33);
		product3.setName("CR");
		product3.setDescription("Cream Roll");
		product3.setPrice(10.0);
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		
		return products;
	}
	
}
