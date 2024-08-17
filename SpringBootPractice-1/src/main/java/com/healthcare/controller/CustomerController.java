package com.healthcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.healthcare.model.Customer;
import com.healthcare.service.CustomerService;


@RestController
public class CustomerController {
	@Autowired
	CustomerService service; 
	@GetMapping(value = "{id}",produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> getCustomerMessage(@PathVariable("id") String id){
		Customer cust1 = new Customer();
		System.out.println("id"+id);
		cust1.setId(Integer.parseInt(id));
		return new ResponseEntity<Customer>(cust1, HttpStatus.ACCEPTED);
	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Customer> createCustomerMessage(@RequestBody Customer cus){
		
		service.createCustomer(cus);
		return new ResponseEntity<Customer>(cus, HttpStatus.ACCEPTED);
	}
	
}
