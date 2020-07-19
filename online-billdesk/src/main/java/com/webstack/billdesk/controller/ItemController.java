package com.webstack.billdesk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webstack.billdesk.dto.ItemsDTO;

@RestController
@RequestMapping("/api")
public class ItemController {

	
	@GetMapping("/items")
	public List<ItemsDTO> list(){
		
		List<ItemsDTO> items = new ArrayList<>();
		
		ItemsDTO item1 = new ItemsDTO();
		item1.setId(1l);
		item1.setName("Computer");
		item1.setDescription("HP Computer");
		item1.setPrice(25000.0);
		item1.setSalePrice(28000.0);
		item1.setGstPercentage(10);
		
		
		ItemsDTO item2 = new ItemsDTO();
		item2.setId(2l);
		item2.setName("Laptop");
		item2.setDescription("HP Notebook");
		item2.setPrice(35000.0);
		item2.setSalePrice(38000.0);
		item2.setGstPercentage(10);
		
		items.add(item1);
		items.add(item2);
		
		return items;
		
	}
	
	
}
