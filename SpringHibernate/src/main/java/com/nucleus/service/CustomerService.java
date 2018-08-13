package com.nucleus.service;

import java.util.List;

import com.nucleus.model.Customer;

public interface CustomerService {

	public Customer addcustomer(Customer customer);
	public void deleteCustomer(int customerCode);
	public Customer viewCustomer(int customerCode);
	public List<Customer> viewAll();
	public Customer updateCustomer(Customer customer);
//	public void logout();
}
