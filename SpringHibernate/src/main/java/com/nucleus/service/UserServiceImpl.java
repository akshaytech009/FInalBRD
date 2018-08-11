package com.nucleus.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nucleus.dao.UserDao;
import com.nucleus.model.User;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Transactional
	public User adduser(User user) {
		userDao.addUser(user);
		return user;
	}

}

