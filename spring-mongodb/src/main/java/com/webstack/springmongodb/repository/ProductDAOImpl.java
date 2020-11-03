package com.webstack.springmongodb.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.webstack.springmongodb.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return mongoTemplate.findAll(Product.class);
	}

	@Override
	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.findOne(query, Product.class);
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return mongoTemplate.save(product);
	}

}
