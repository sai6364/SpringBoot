package com.healthcare.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.model.Customer;
@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
		
}
