package com.webstack.springrestdemo.service;

import java.util.List;

import com.webstack.springrestdemo.dto.ProductDTO;

public interface ProductService extends IService<ProductDTO>{

	List<ProductDTO> getProductByName(String productName);
	
}
