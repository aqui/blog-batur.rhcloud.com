package com.akifbatur.blog.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akifbatur.blog.entity.Role;
import com.akifbatur.blog.repository.RoleRepository;

/**
 * @author Akif Batur
 * 
 * Repository implementation class for Repository: RoleRepository
 * 
 */
@Repository("roleRepository")
public class RoleRepositoryImpl implements RoleRepository 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(RoleRepositoryImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveRole(Role role) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(role);
	}
}