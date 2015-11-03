package com.akifbatur.blog.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.akifbatur.blog.entity.User;
import com.akifbatur.blog.repository.UserRepository;
import com.akifbatur.blog.service.UserService;

/**
 * @author Akif Batur
 * 
 * Service implementation class for Service: UserService
 * 
 */
@Service("userService")
public class UserServiceImpl implements UserService 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public void saveUser(User user) 
	{
		userRepository.saveUser(user);
	}
}