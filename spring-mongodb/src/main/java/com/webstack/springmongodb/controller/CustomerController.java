package com.webstack.springmongodb.controller;

import org.springframework.web.bind.annotation.RestController;

import com.webstack.springmongodb.model.Customer;
import com.webstack.springmongodb.repository.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("/sayHello")
	public String sayHello() {
		return "Hello Radhe Krishna...!";
	}
	
	@GetMapping("/customers")
	public List<Customer> cutomerList() {
		return customerRepository.findAll();
	}
	
	@GetMapping("/customers/{id}")
	public Customer cutomerList(@PathVariable String id) {
		return customerRepository.findById(id).get();
	}
}
