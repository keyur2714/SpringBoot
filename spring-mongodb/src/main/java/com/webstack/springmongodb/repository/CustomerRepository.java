package com.webstack.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webstack.springmongodb.model.Customer;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{

}
