package com.nucleus.service;

import java.util.List;

import com.nucleus.model.Customer;

public interface CustomerService {

	public Customer addcustomer(Customer customer);
	public void deleteCustomer(String customerCode);
	public Customer viewCustomer(String customerCode);
	public List<Customer> viewAll();
	public Customer updateCustomer(Customer customer);
}
