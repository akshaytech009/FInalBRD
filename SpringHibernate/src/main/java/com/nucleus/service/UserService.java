package com.nucleus.service;

import java.util.List;

import com.nucleus.model.User;


public interface UserService {

	public User adduser(User user);
	public void deleteUser(int id);
	public List<User> viewAllUser();
}

