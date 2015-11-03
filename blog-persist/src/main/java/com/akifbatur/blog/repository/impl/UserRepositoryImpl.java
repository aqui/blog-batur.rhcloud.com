package com.akifbatur.blog.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akifbatur.blog.entity.User;
import com.akifbatur.blog.repository.UserRepository;

/**
 * @author Akif Batur
 * 
 * Repository implementation class for Repository: UserRepository
 * 
 */
@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveUser(User user) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(user);
	}	
}