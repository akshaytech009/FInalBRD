package com.nucleus.service;

import java.util.List;

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
		EncodingPassword encode = new EncodingPassword();
		encode.encryptPass(user);
		userDao.addUser(user);
		return user;
	}
	@Transactional
	public void deleteUser(int id) {
		userDao.deleteUser(id);
		
	}
	@Transactional
	public List<User> viewAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}

}

