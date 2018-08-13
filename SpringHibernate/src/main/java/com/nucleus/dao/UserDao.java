package com.nucleus.dao;

import java.util.List;

import com.nucleus.model.User;


public interface UserDao {

	public User addUser(User user);
	public void deleteUser(int id);
	public List<User> getAllUser();
}
