package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.beans.*;
import com.example.demo.exception.CustomerException;

import java.util.*;

import com.example.demo.services.CustomerServiceImpl;

@RestController
public class CustomerController {
	@Autowired
	CustomerServiceImpl service;
	@GetMapping("/getCustomer")
	public ResponseEntity<List<Customer>> getCustomer(){
		return new ResponseEntity<List<Customer>>(service.getCustomer(),HttpStatus.OK);
	}
		@GetMapping("/searchCustomer/{id}")
	    public ResponseEntity<Customer> searchCustomerById(@PathVariable int  id) throws CustomerException {
          return new ResponseEntity<Customer>(service.searchCustomerById(id), HttpStatus.OK);
	    }
		@PostMapping("/addCustomer")
	    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) throws CustomerException {
          return new ResponseEntity<Customer>(service.addCustomer(customer), HttpStatus.OK);
	    }
		 @DeleteMapping("/deleteCustomer/{id}")
		    public ResponseEntity<Customer> deleteEmployee(@PathVariable int id) throws CustomerException {
               return new ResponseEntity<Customer>(service.deleteCustomer(id), HttpStatus.OK);
		    }
		 @PutMapping("/updateEmployee/{id}")
		    public ResponseEntity<Customer> updateEmployee(@PathVariable int id, @RequestBody Customer customer)
		            throws CustomerException {
               return new ResponseEntity<Customer>(service.updateCustomer(customer, id), HttpStatus.OK);
		    }
	 
	}


