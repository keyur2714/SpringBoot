package com.webstack.springmongodb.repository;

import java.util.List;

import com.webstack.springmongodb.model.Product;

public interface ProductDAO {

	List<Product> getAllProducts();
	Product getProductById(String id);
	Product addProduct(Product product);
	
}
