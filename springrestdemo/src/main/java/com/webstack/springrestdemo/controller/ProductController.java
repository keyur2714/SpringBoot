package com.webstack.springrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.springrestdemo.dto.ProductDTO;
import com.webstack.springrestdemo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/sayHello")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<String>("Hello Radhe Krishna...",HttpStatus.OK);
	}

	@GetMapping("/products")
	public ResponseEntity<List<ProductDTO>> list() {
		return new ResponseEntity<List<ProductDTO>>(productService.list(),HttpStatus.OK);
	}

	@GetMapping("/products/{id}")
	public ProductDTO get(@PathVariable Integer id) {
		return productService.get(id);
	}

	@PostMapping("/products")
	public void save(@RequestBody ProductDTO productDTO) {
		productService.save(productDTO);
	}

	@PutMapping("/products/{id}")
	public void update(@RequestBody ProductDTO productDTO, @PathVariable Integer id) {		
		productService.update(productDTO,id);
	}

	@DeleteMapping("/products/{id}")
	public void delete(@PathVariable Integer id) {
		productService.delete(id);
	}
	
	@GetMapping("/productsByName/{name}")
	public List<ProductDTO> listByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}
}
