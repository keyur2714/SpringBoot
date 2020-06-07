package com.webstack.coredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.webstack.coredemo.dto.AddressDTO;
import com.webstack.coredemo.dto.CustomerDTO;

@SpringBootApplication
public class CoredemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(CoredemoApplication.class, args);
		System.out.println("Hello Radhe Krishna...!");
		
		CustomerDTO customerDTO = context.getBean(CustomerDTO.class);
		customerDTO.setId(123l);
		customerDTO.setCustomerName("keyur");
		customerDTO.setMobileNo("7387029671");
		
		AddressDTO addressDTO = context.getBean(AddressDTO.class);
		addressDTO.setAddress1("Pimple Saudagar");
		addressDTO.setAddress2("Kunal Icon Road");
		addressDTO.setCity("PUNE");
		addressDTO.setState("Maharashtra");
		
		customerDTO.setAddress(addressDTO);
		
		System.out.println(customerDTO);
		System.out.println(customerDTO.getAddress().getAddress1());
		
		CustomerDTO customerDTO1 = context.getBean(CustomerDTO.class);
		System.out.println(customerDTO1);
		
		
		
	}

}
