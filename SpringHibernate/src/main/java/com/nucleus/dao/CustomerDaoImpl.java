package com.nucleus.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nucleus.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	SessionFactory factory;

	public Customer addCustomer(Customer customer) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy");
		customer.setRegistrationDate(format.format(date));
		factory.getCurrentSession().saveOrUpdate(customer);
		return customer;
	}

	public void deleteCustomer(String customerCode) {
		Customer customer = new Customer();
		customer.setCustomerCode(customerCode);
		factory.getCurrentSession().delete(customer);

	}

	public Customer viewCustomer(String customerCode) {
		Customer customer = (Customer) factory.getCurrentSession().get(Customer.class, customerCode);
		return customer;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		
		return factory.getCurrentSession().createCriteria(Customer.class).list();
	}

	public Customer updateCustomer(Customer customer) {
		
		factory.getCurrentSession().update(customer);
		return customer;
	}
}
