package com.example.demo.services;

import java.util.List;

import com.example.demo.beans.Customer;
import com.example.demo.exception.CustomerException;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer) throws CustomerException;
	public List<Customer> getCustomer();
	public Customer searchCustomerById(int id) throws CustomerException;
	public Customer deleteCustomer(int id) throws CustomerException;
	public Customer updateCustomer(Customer customer, int id) throws CustomerException;

}
