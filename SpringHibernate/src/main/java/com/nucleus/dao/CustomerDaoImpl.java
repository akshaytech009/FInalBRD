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
	SessionFactory sessionFactory;

	public Customer addCustomer(Customer customer) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy");
		customer.setRegistrationDate(format.format(date));
		sessionFactory.getCurrentSession().saveOrUpdate(customer);
		return customer;
	}

	public void deleteCustomer(int customerCode) {
		Customer customer = new Customer();
		customer.setCustomerCode(customerCode);
		sessionFactory.getCurrentSession().delete(customer);

	}

	public Customer viewCustomer(int customerCode) {
		Customer customer = (Customer) sessionFactory.getCurrentSession().get(Customer.class, customerCode);
		return customer;
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomers() {
		
		return sessionFactory.getCurrentSession().createCriteria(Customer.class).list();
	}

	public Customer updateCustomer(Customer customer) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy");
		customer.setModifiedDate(format.format(date));
		sessionFactory.getCurrentSession().update(customer);
		return customer;
	}

//	public void logout() {
//		sessionFactory.getCurrentSession().close();
//		
//	}
}
