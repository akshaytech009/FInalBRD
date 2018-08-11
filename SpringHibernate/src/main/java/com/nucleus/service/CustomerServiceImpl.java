package com.nucleus.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleus.dao.CustomerDao;
import com.nucleus.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;

	@Transactional
	public Customer addcustomer(Customer customer) {

		customerDao.addCustomer(customer);
		return customer;
	}

	@Transactional
	public void deleteCustomer(int customerCode) {
		customerDao.deleteCustomer(customerCode);

	}

	@Transactional
	public Customer viewCustomer(int customerCode) {

		return customerDao.viewCustomer(customerCode);
	}

	@Transactional
	public List<Customer> viewAll() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}

	@Transactional
	public Customer updateCustomer(Customer customer) {
		return customerDao.updateCustomer(customer);
	}

}
