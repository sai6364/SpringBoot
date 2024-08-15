package com.healthCare.service;

import org.springframework.stereotype.Service;

import com.healthCare.claim.model.Customer;
@Service
//It supports the transaction managements.
public class CustomerService {

	public Customer createCustomer(Customer customer) {
		//repository(Data Associate Object DAO) it isolates Database interactions from other layers application
		return null;
	}
}
