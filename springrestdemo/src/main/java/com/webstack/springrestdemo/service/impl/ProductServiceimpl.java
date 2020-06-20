package com.webstack.springrestdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webstack.springrestdemo.dto.ProductDTO;
import com.webstack.springrestdemo.entity.Product;
import com.webstack.springrestdemo.repository.ProductRepository;
import com.webstack.springrestdemo.service.ProductService;

@Service
@Transactional
public class ProductServiceimpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void save(ProductDTO productDTO) {
		Product product = new Product();
		product.setName(productDTO.getName());
		product.setDescription(productDTO.getDescription());
		product.setPrice(productDTO.getPrice());
		productRepository.save(product);
	}

	@Override
	public ProductDTO get(Integer id) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(id).get();
		ProductDTO productDTO = new ProductDTO();
		productDTO.setId(product.getId());
		productDTO.setName(product.getName());
		productDTO.setDescription(product.getDescription());
		productDTO.setPrice(product.getPrice());
		
		return productDTO;
	}

	@Override
	public List<ProductDTO> list() {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findAll();
		List<ProductDTO> productDtos = new ArrayList<ProductDTO>();
		for(Product product : products) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setId(product.getId());
			productDTO.setName(product.getName());
			productDTO.setDescription(product.getDescription());
			productDTO.setPrice(product.getPrice());
			productDtos.add(productDTO);
		}
		return productDtos;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		productRepository.delete(productRepository.findById(id).get());
	}

	@Override
	public List<ProductDTO> getProductByName(String productName) {
		
		List<Product> products = productRepository.findProductByName(productName);
		List<ProductDTO> productDtos = new ArrayList<ProductDTO>();
		for(Product product : products) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setId(product.getId());
			productDTO.setName(product.getName());
			productDTO.setDescription(product.getDescription());
			productDTO.setPrice(product.getPrice());
			productDtos.add(productDTO);
		}
		return productDtos;
	}

	@Override
	public void update(ProductDTO productDTO, Integer id) {
		// TODO Auto-generated method stub
		Product existingProduct = productRepository.findById(id).get();
		existingProduct.setName(productDTO.getName());
		existingProduct.setDescription(productDTO.getDescription());
		existingProduct.setPrice(productDTO.getPrice());
		productRepository.save(existingProduct);
	}

}
