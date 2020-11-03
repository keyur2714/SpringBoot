package com.webstack.springmongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.springmongodb.model.Product;
import com.webstack.springmongodb.repository.ProductDAO;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductDAO productDAO;
	
	@GetMapping("/sayHi")
	public String sayHello() {
		return "Hello Radhe Krishna...!";
	}
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable String id) {
		return productDAO.getProductById(id);
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return productDAO.addProduct(product);
	}
	
}
