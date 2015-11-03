package com.akifbatur.blog.repository.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akifbatur.blog.entity.User;
import com.akifbatur.blog.repository.LoginRepository;

/**
 * @author Akif Batur
 * 
 * Repository implementation class for Repository: LoginRepository
 * 
 */
@Repository("loginRepository")
public class LoginRepositoryImpl implements LoginRepository
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(LoginRepositoryImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User getUserByUsername(String username) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		Query query = session.createQuery("from User where USERNAME = :username");
		query.setString("username", username);
		if(query.list().size()>0)
		{
			User user = (User) query.list().get(0);
			return user;
		}
		else
		{
			return null;
		}
	}
}
