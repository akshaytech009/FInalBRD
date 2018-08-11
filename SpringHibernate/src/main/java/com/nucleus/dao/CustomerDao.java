package com.nucleus.dao;

import java.util.List;

import com.nucleus.model.Customer;

public interface CustomerDao {
	
	public Customer addCustomer(Customer customer);
	public void deleteCustomer(int customerCode);
	public Customer viewCustomer(int customerCode);
	public List<Customer> getAllCustomers();
	public Customer updateCustomer(Customer customer);

}
