package com.nucleus.dao;

import java.util.List;

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

	public void deleteUser(int id) {
		User user = new User();
		user.setId(id);
		factory.getCurrentSession().delete(user);
		
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return factory.getCurrentSession().createCriteria(User.class).list();
	}

}
