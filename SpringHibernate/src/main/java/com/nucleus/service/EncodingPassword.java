package com.nucleus.service;

import java.util.logging.Logger;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.nucleus.model.User;

public class EncodingPassword {

	static Logger log = Logger.getLogger(EncodingPassword.class.getName());
	
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
	
	public void encryptPass(User user)
	{
		String pass = passwordEncoder.encode(user.getPassword());
		user.setPassword(pass);
	}
}

