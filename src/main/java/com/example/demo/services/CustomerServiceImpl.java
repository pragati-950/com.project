package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Customer;
import com.example.demo.dao.CustomerDAO;
import com.example.demo.exception.CustomerException;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	CustomerDAO dao;

	@Override
	public Customer addCustomer(Customer customer) throws CustomerException {
		
      if(!dao.findById(customer.getId()).isPresent())
		return dao.save(customer);
      else 
    	  throw new CustomerException("Id already exists");
	}

	@Override
	public List<Customer> getCustomer()  {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Customer searchCustomerById(int id) throws CustomerException {
		// TODO Auto-generated method stub
		if(dao.findById(id).isPresent())
		return dao.findById(id).get();
		else
			throw new CustomerException("Does not exists");
	}

	@Override
	public Customer deleteCustomer(int id) throws CustomerException {
		// TODO Auto-generated method stub
		if(dao.findById(id).isPresent())
		return dao.findById(id).get();
		else
			throw new CustomerException("Does not exists");
	}

	@Override
	public Customer updateCustomer(Customer customer, int id) throws CustomerException {
		// TODO Auto-generated method stub
		if(dao.findById(id).isPresent())
		return dao.saveAndFlush(customer);
		else
			throw new CustomerException("Does not exists");
	}
	

}
