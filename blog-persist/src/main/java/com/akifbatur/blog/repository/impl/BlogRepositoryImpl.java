package com.akifbatur.blog.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akifbatur.blog.entity.Blog;
import com.akifbatur.blog.repository.BlogRepository;

/**
 * @author Akif Batur
 * 
 * Repository implementation class for Repository: BlogRepository
 * 
 */
@Repository("blogRepository")
public class BlogRepositoryImpl implements BlogRepository 
{
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(BlogRepositoryImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveBlog(Blog blog) 
	{
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(blog);
	}
}