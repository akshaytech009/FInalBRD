package com.nucleus.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nucleus.model.User;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory factory;
	
	public User addUser(User user) {
		factory.getCurrentSession().save(user);
		return user;
	}

}
